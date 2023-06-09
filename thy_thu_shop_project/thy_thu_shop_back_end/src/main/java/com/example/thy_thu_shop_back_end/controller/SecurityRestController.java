package com.example.thy_thu_shop_back_end.controller;

import com.example.thy_thu_shop_back_end.model.Account;
import com.example.thy_thu_shop_back_end.security_authentication.jwt.JwtFilter;
import com.example.thy_thu_shop_back_end.security_authentication.jwt.JwtUtility;
import com.example.thy_thu_shop_back_end.security_authentication.payload.reponse.JwtResponse;
import com.example.thy_thu_shop_back_end.security_authentication.payload.reponse.MessageResponse;
import com.example.thy_thu_shop_back_end.security_authentication.payload.request.LoginRequest;
import com.example.thy_thu_shop_back_end.security_authentication.payload.request.ResetPasswordRequest;
import com.example.thy_thu_shop_back_end.security_authentication.service.AccountDetails;
import com.example.thy_thu_shop_back_end.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/public")
@CrossOrigin
public class SecurityRestController {
    @Autowired
    private JwtUtility jwtUtility;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private IAccountService accountService;

    @Autowired
    private JavaMailSender emailSender;

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword());
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtility.generateJwtToken(loginRequest.getUsername());
        AccountDetails userDetails = (AccountDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        return ResponseEntity.ok(
                new JwtResponse(
                        jwt,
                        userDetails.getUsername(),
                        accountService.findAccountByEmail(loginRequest.getUsername()).getName(),
                        roles)
        );
    }


    @GetMapping("/reset-password/{username}")
    public ResponseEntity<MessageResponse> resetPassword(@Valid @PathVariable String username) {
        Account account = accountService.findAccountByEmail(username);
        if (account != null && !username.isEmpty()) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(username);
            message.setSubject("Mật khẩu mới.");
            String newPassword = String.valueOf(new Random().nextInt(900000) + 100000);
            message.setText("Mật khẩu mới của bạn là: " + newPassword);
            try {
                accountService.saveNewPassword(newPassword, account.getAccountId());
                emailSender.send(message);
                return ResponseEntity.ok(new MessageResponse("Mật khẩu mới đã gửi về mail của bạn."));
            } catch (Exception e) {
                return ResponseEntity.badRequest()
                        .body(new MessageResponse("Gửi mail thất bại."));
            }
        }
        return new ResponseEntity<>(new MessageResponse("Tài khoản không đúng hoặc chưa đăng ký!"), HttpStatus.BAD_REQUEST);
    }



    @PostMapping("/change-password")
    public ResponseEntity<?> changePassword(@Valid @RequestBody ResetPasswordRequest resetPasswordRequest, BindingResult bindingResult,
                                            HttpServletRequest httpServletRequest) {
        String token = JwtFilter.parseJwt(httpServletRequest);
        String username = jwtUtility.getUserNameFromJwtToken(token);
        Account account = accountService.findAccountByEmail(username);
        if (account == null) {
            bindingResult.rejectValue("findAccount", "findAccount", "Tài khoản email không hợp lệ!");
        }
        assert account != null;
        boolean checkPassword = accountService.checkPassword(resetPasswordRequest.getPassword(), account.getPassword());
        boolean checkNewPassword = Objects.equals(resetPasswordRequest.getNewPassword(), resetPasswordRequest.getConfirmNewPassword());
        if (!checkPassword) {
            bindingResult.rejectValue("password", "password", "Mật khẩu không đúng!");
        }
        if (!checkNewPassword) {
            bindingResult.rejectValue("confirmNewPassword", "confirmNewPasswordError", "Mật khẩu xác nhận phải giống mật khẩu mới.");
        }
        new ResetPasswordRequest().validate(resetPasswordRequest, bindingResult);
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldErrors(), HttpStatus.BAD_REQUEST);
        } else {
            accountService.saveNewPassword(resetPasswordRequest.getNewPassword(), account.getAccountId());
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
