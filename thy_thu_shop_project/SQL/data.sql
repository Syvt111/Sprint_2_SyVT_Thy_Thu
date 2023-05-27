use thy_thu_project;

INSERT INTO `thy_thu_project`.`role` (`role_name`) VALUES
('ROLE_ADMIN'),
 ('ROLE_USER ')
 ;
 
 INSERT INTO `thy_thu_project`.`account` (email, `password`, username, flag_delete, avatar, `name`, gender, phone_number, address) VALUES 
('tiensyvan@gmail.com', '$2a$12$Cnq3Wfw6Z.tyk4wUeonh1ukHrXMv/ARksOxF8Lo7DqUxeH44IpIP.', 'tiensyvan@gmail.com', 0, 'https://scontent.fsgn2-7.fna.fbcdn.net/v/t39.30808-6/329957660_518849393693507_1360756579603794620_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=zsic4OzXswsAX_jR-au&_nc_oc=AQmwqqDJvom5QmRPIKuyX-y3Ftq9WuNj_6L_L6_kMeOv1Q-IZ5kfY8qkjqGWPmjpL0Y&_nc_ht=scontent.fsgn2-7.fna&oh=00_AfDsjQ_ZMkm1UlOY_Tmj_cwRAXGZQS4Wo6rQpxxICExDyg&oe=6444B7C0', 'Tiến Sỹ', 1, '123456789', 'Đà Nẵng'), 
('tranthithanhthu26296@gmail.com', '$2a$12$Cnq3Wfw6Z.tyk4wUeonh1ukHrXMv/ARksOxF8Lo7DqUxeH44IpIP.', 'tranthithanhthu26296@gmail.com', 0, 'https://scontent.fsgn2-3.fna.fbcdn.net/v/t39.30808-6/337683244_251163847249612_2438987209407196604_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=djnRIkx5Cc0AX9e9Dxh&_nc_ht=scontent.fsgn2-3.fna&oh=00_AfD2Fvz5AkDyBL7YiTYj6x2xR_J_U6IVg1880y8D9waO3g&oe=6444FFB7', 'Thanh Thu', 0, '987654321', 'Đà Nẵng'),
('trantuan1010@gmail.com', '$2a$12$Cnq3Wfw6Z.tyk4wUeonh1ukHrXMv/ARksOxF8Lo7DqUxeH44IpIP.', 'trantuan1010@gmail.com', 0, 'https://scontent.fsgn2-4.fna.fbcdn.net/v/t39.30808-6/329152017_569926781705130_6197549642398066089_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=7dPXfYZQcCoAX_66PT1&_nc_ht=scontent.fsgn2-4.fna&oh=00_AfDBpjiBoLB6XDF83qI9al8RThA1fJJHSRTHu8X47bgTfw&oe=6444E333', 'Trần Tuấn', 1, '987654210', 'Đà Nẵng')
;

INSERT INTO `thy_thu_project`.`account_role` (`account_id`,`role_id`) VALUES 
('1','1'),
('1','2'),
 ('2','2'), 
 ('3','2');
 
 INSERT INTO `thy_thu_project`.`category` (`category_name`) VALUES 
('Ví'), 
('Giày Nam'), 
('Giày Nữ'), 
('Kính Nam'), 
('Kính Nữ'), 
('Tú Xách'), 
('Bao Lô'), 
('Thắt Lưng')
;

INSERT INTO `thy_thu_project`.`product` (`product_name`, `price`, `description`, `flag_delete`, `category_id`,`brand`) VALUES 
('Balo túi xách', '400000', 'TD4, đứng 31cm, ngang 27cm', 0, 7,'Italy'),
('Giày lười BogNer', '480000', 'Size 40, dà bò', 0, 2,'USA'),
('Giày tây Caminado', '300000', 'Size 43, dà bò', 0, 2,'USA'),
('Giày Sandan Topten', '320000', 'Size 43', 0, 2,'USA'),
('Ví cầm tay', '350000', 'Da thật 100%, ngang 25cm, đứng 15cm', 0, 1,'Italy'),
('Túi xách laptop TB5.20', '550000', 'ESQUIRE, đứng 33cm, ngang 38cm', 0, 6,'ESQUIRE'), 
('Giày lười A5.48', '450000', 'Size 43, da cá sấu', 0, 2,'Lacoste'),
('Thắt lưng N30', '250000', 'Bản rộng 3,5cm,dài 120cm, da thật cao cấp', 0, 9,'Italy'),
('Thắt lưng N29', '269000', 'Bản rộng 3,5cm,dài 120cm, da thật cao cấp', 0, 9,'Italy'),
('Thắt lưng N7', '300000', 'Bản rộng 3,5cm,dài 120cm, da thật cao cấp', 0, 9,'Italy'),
('Ví Cá Sấu CS', '550000', 'Da cá sấu, da thật 100%', 0, 1,'Lacoste'),
('Ví cầm tay TA5.18', '350000', 'PORTS, ngang 24cm, đứng 16cm', 0, 1,'PORTS'),
('Túi xách laptop TA5.6', '700000', 'GUICI, đứng 28cm, ngang 38cm', 0, 6,'GUICI'), 
('Túi xách laptop TK4.21', '750000', 'LV, đứng 27cm, ngang 35cm', 0, 6,'LV'), 
('Giày H4.66', '300000', 'Size 40', 0, 2,'USA'),
('Ví Vip.V3', '200000', 'CEFIRO, Da cao cấp', 0, 1,'CEFIRO'),
('Kinh Rb3450', '300000', 'RayBan, tròng thủy tinh', 0, 5,'RayBan'),
('Kinh gấp RB3479', '400000', 'RayBan gấp, mắt đen, tròng thủy tinh', 0, 5,'RayBan'),
('Kinh gấp z0866', '400000', 'LV,Tròng phim, gọng vàn, mắt trà', 0, 5,'LV'),
('Ví Vip.V13', '200000', 'CEFIRO ngang, nâu ,Da cao cấp', 0, 1,'CEFIRO'),
('Ví Vip.V29', '200000', 'CEFIRO ngang, nâu đen ,Da cao cấp', 0, 1,'CEFIRO'),
('Ví Vip.V11', '200000', 'CEFIRO đứng, xanh đen ,Da cao cấp', 0, 1,'CEFIRO'),
('Balo TE4.41', '450000', 'TD4, đứng 27cm, ngang 25cm', 0, 7,'Italy'),
('Giày boot E4.1', '350000', 'Landrover,Size 40, dà bò', 0, 2,'Landrover')
;

INSERT INTO `thy_thu_project`.`image` (`img`,`product_id`) VALUES
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F1%2F342201125_763240505291227_4015620424053841041_n.jpg?alt=media&token=79201f7d-8c6f-4e30-b164-b6e7a777e236', 1),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F1%2F341745730_3451600185097091_1318757717211766963_n.jpg?alt=media&token=bbed15bb-7b50-47b6-a73b-4b18a01f05d8',1 ),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F1%2F342360529_236223355752220_1434832168012411361_n.jpg?alt=media&token=7fe6a901-e2e4-4a45-9981-d8c18cdf36b6', 1),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F1%2F342526112_1384774212302828_2091375859014278280_n.jpg?alt=media&token=0e233a0a-0fe1-46a9-83b6-2b20401a49e1', 1),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F2%2F1.jpg?alt=media&token=3d5f72e2-5733-4f2c-a0ff-8d9ca979ad8a', 2),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F2%2F2.jpg?alt=media&token=4f74f6f7-0435-46eb-8dc5-f65dfead999d', 2),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F2%2F3.jpg?alt=media&token=2b999ead-c0af-4a27-abe0-b5ae4b535b05', 2),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F2%2F4.jpg?alt=media&token=b82a981c-b1af-4000-871e-e598f296daae', 2),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F3%2F1.jpg?alt=media&token=90e2bec3-bbfd-42d5-ae67-0558026b5947', 3),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F3%2F2.jpg?alt=media&token=306605f9-4849-41ad-b602-2887144bc08f', 3),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F3%2F3.jpg?alt=media&token=e046e354-39f4-4332-b4b0-40c44669440c', 3),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F3%2F4.jpg?alt=media&token=4133b90e-aefd-4e55-b8ec-a2ec93409913', 3),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F4%2F345846460_6379325438801869_4007715598204616604_n.jpg?alt=media&token=91d158a3-1bd0-4186-a90e-03772ade05e9', 4),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F4%2F345849216_180179254979849_6914383464096180152_n.jpg?alt=media&token=f0521bd9-3091-42e4-9fd6-92baeb7bd3bf', 4),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F4%2F346041146_255675493539270_6199117428814163137_n.jpg?alt=media&token=5402eb16-2d21-4049-be9c-fb964da7a725', 4),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F4%2F346284365_845829773506957_2464549538790154808_n.jpg?alt=media&token=1a469f8d-0a38-4a92-abfe-0a01e6538182', 4),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F5%2F345854766_916079939501500_5603128656327523870_n.jpg?alt=media&token=57a0c20c-e9fa-4465-94e3-957ef52100af', 5),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F5%2F345859037_1297078951231942_1077490497622792495_n.jpg?alt=media&token=3a4d9e2a-d2f3-474f-8f95-341578d976de', 5),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F5%2F345860642_579469454285015_3045082248139465337_n.jpg?alt=media&token=b48dca0d-7373-4f4e-a463-98da8c33b970', 5),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F6%2F345288948_945774876764498_8669613726114502446_n.jpg?alt=media&token=c3b71831-2f45-4d47-9cea-37f0ffeb07ad', 6),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F6%2F345622301_919326272520965_174169921534976266_n.jpg?alt=media&token=f5ea8331-6362-45dc-946b-40ee17eab73e', 6),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F6%2F345838793_781135343569364_6349962661092261320_n.jpg?alt=media&token=f23177c0-69e9-4b6b-8047-8758ae84e1a7', 6),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F6%2F345844947_762426762020976_801963964197529235_n.jpg?alt=media&token=b2ec0fd5-f183-4079-840d-1c28b1eeb5d9', 6),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F7%2F1.jpg?alt=media&token=1ad17ac3-2fa3-468d-85a9-2e59f520fb44', 7),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F7%2F2.jpg?alt=media&token=85d38340-614f-4bbe-8e23-31c0d5c12a09', 7),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F7%2F3.jpg?alt=media&token=8e1084ea-89ba-4c4c-b79a-479e8f01939b', 7),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F7%2F4.jpg?alt=media&token=a66255ff-fe61-4ffd-a483-842a0142757c', 7),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F8%2F8.th%C4%83t-lung-quan-au.jpg?alt=media&token=9f46b83a-d341-4c9b-afd0-d5bc1a29ebec', 8),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F9%2F9.that-lung-quang-au.jpg?alt=media&token=67f2cd20-dc05-4b3f-bc56-ce6acd0eb464', 9),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F10%2F10.that-lung-quan-au.jpg?alt=media&token=4ced60e4-58aa-486d-b048-c46c90bedd77', 10),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F11%2F345440756_800153757826059_6591108191972240908_n.jpg?alt=media&token=903c75cc-304d-49e7-b38c-23bd3c3412db', 11),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F11%2F345452268_643771534222562_6250776856658307827_n.jpg?alt=media&token=ae214dcf-a824-4075-a586-bc952a50802a', 11),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F12%2F1.jpg?alt=media&token=71187987-2e06-4995-96e1-4a50a2f14530', 12),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F12%2F2%20(2).jpg?alt=media&token=2a3ddc8e-9402-493b-9f83-3a750d772ac3', 12),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F12%2F2.jpg?alt=media&token=f1c8f7c8-af49-4840-878d-2f82ffcfd004', 12),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F12%2F4.jpg?alt=media&token=451280f2-ca96-40bf-9194-18138ec63a31', 12),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F13%2F1.jpg?alt=media&token=a698797b-04f7-467b-a3c1-3ce1c329bde1', 13),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F13%2F2.jpg?alt=media&token=01406311-4ed7-42b9-a36c-9928fb72f5ec', 13),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F13%2F3.jpg?alt=media&token=7a9d0fce-ebba-4231-bb3c-02a4d8c75006', 13),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F13%2F4.jpg?alt=media&token=c5ed34b6-3730-44fa-97a4-c47872e1cb9c', 13),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F14%2F1.jpg?alt=media&token=11b08e37-c060-4fe6-873f-d22f15178b50', 14),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F14%2F2.jpg?alt=media&token=6507bd3e-6daa-46c1-a0a7-4a976957d367', 14),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F14%2F3.jpg?alt=media&token=d96a92c0-70c1-48b0-90d3-c2c13a63c3a5', 14),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F14%2F4.jpg?alt=media&token=7e587dcc-27f6-4747-889e-1030a6955fd9', 14),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F15%2F343109666_215523024527761_7027698132570096990_n.jpg?alt=media&token=40897a86-b68c-4321-80a5-250284ae09e1', 15),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F15%2F343213553_559698732978626_7565689688666488670_n.jpg?alt=media&token=2e820841-2210-4ae3-9f4b-5395d7cc84d5', 15),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F15%2F343518921_182185161404167_7750755580601791379_n.jpg?alt=media&token=1adb753c-e7ed-4a33-a7e1-d1ab72f96093', 15),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F15%2F343639335_184237077812433_6962536295676015399_n.jpg?alt=media&token=a146cf05-3a50-4400-8a9b-172c52c2866c', 15),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F16%2FIMG_4132.JPG?alt=media&token=9603d2c6-5e6b-4d86-bdc4-2173543a2fce', 16),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F16%2FIMG_4133.JPG?alt=media&token=84bb1e3f-438c-4de2-b78c-77ee54f6d69e', 16),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F16%2FIMG_4134.JPG?alt=media&token=fd654784-d258-4b10-892c-b60c6bf2fe3f', 16),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F16%2FIMG_4135.JPG?alt=media&token=15e743bb-f411-4fdc-901a-9e0f34800d8c', 16),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F17%2FIMG_7692.PNG?alt=media&token=56f6f5fb-072a-48aa-bac5-88366120713e', 17),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F17%2FIMG_7693.PNG?alt=media&token=68acb956-b5d5-4539-b510-5532a9764d8d', 17),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F17%2FIMG_7694.PNG?alt=media&token=bf1e00d5-2d4d-4a3a-bd24-ffc71791bfb8', 17),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F17%2FIMG_7695.PNG?alt=media&token=ca0306cf-3cb3-49fb-af1b-baf9b8bfe6ce', 17),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F18%2FEFLM9245.PNG?alt=media&token=102fb9cc-c440-4079-88c0-5b3664e89a21', 18),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F18%2FGWWC1452.PNG?alt=media&token=cbd17eb4-dc22-46a9-8f83-499b7f9259c6', 18),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F18%2FRNRP1664.PNG?alt=media&token=1f2b5e1c-764e-425b-938d-dbbf9b771250', 18),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F18%2FUNNR8867.PNG?alt=media&token=00c70b34-5a03-4d79-a676-6d368b7a27f2', 18),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F19%2F1.PNG?alt=media&token=df000123-4127-4a79-b9eb-060112fadc4c', 19),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F19%2F2.PNG?alt=media&token=2b032f9a-d1e8-470b-bf14-7a41ceece339', 19),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F19%2F3.PNG?alt=media&token=4865d344-d9ad-4fe0-96b4-c02919794b0c', 19),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F19%2F4.PNG?alt=media&token=6e6c8138-694d-44be-9e7a-fa371c085e95', 19),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F20%2FIMG_4061.JPG?alt=media&token=77591b82-fd71-4f5a-b019-0464c4724775', 20),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F20%2FIMG_4256.JPG?alt=media&token=b660e335-2187-4118-9be5-e79d89ff78e7', 20),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F20%2FIMG_4257.JPG?alt=media&token=96a1fe88-261a-4bd2-bc7a-aec7035f2d24', 20),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F20%2FIMG_4258.JPG?alt=media&token=fa3ab907-2501-4814-8d31-6449086c4196', 20),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F21%2FIMG_4068.JPG?alt=media&token=a239ef15-ddb3-4589-b27a-04a25106c6d9', 21),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F21%2FIMG_4228.JPG?alt=media&token=8beb42ad-39c8-4c20-908c-520f014bd95e', 21),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F21%2FIMG_4229.JPG?alt=media&token=46323a36-08f7-4f0f-bddf-4e903755d1ac', 21),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F21%2FIMG_4230.JPG?alt=media&token=8e086234-8488-4477-9e51-52873be846b1', 21),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F22%2F1.JPG?alt=media&token=d01465df-7030-476f-bd77-a73e0ccc8640', 22),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F22%2F2.JPG?alt=media&token=462936be-1e1d-4e99-b3f9-c37c81bbeab0', 22),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F22%2F3.JPG?alt=media&token=66e8d27c-1183-49fb-93ec-e87431105aa8', 22),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F22%2F4.JPG?alt=media&token=6c0577ec-e49f-4e94-9a74-9672cb1c567f', 22),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F23%2F1.jpg?alt=media&token=99e65ed3-73ee-4597-84ec-af5ce5f3cbb3', 23),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F23%2F2.jpg?alt=media&token=c0f09248-1d38-47eb-84ee-a1ed66f3ebd2', 23),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F23%2F3.jpg?alt=media&token=41d1bea0-b11b-48fb-8b63-4c1ef83b7449', 23),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F23%2F4.jpg?alt=media&token=03999194-e409-4a34-91e7-302e5e56276d', 23),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F24%2F1.jpg?alt=media&token=ad050d7f-38d3-4e6a-9e7b-578e68412a2a', 24),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F24%2F2.jpg?alt=media&token=65379383-8035-4e5c-9b62-79ae21d24ff4', 24),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F24%2F3.jpg?alt=media&token=f42df0ea-e1ce-48a4-b47c-531f7eec155d', 24),
('https://firebasestorage.googleapis.com/v0/b/graduationthesissyvt.appspot.com/o/thy_thu_project%2F24%2F4.jpg?alt=media&token=56877a58-cc02-48a5-8a46-8903127c5f10', 24),
;

INSERT INTO `thy_thu_project`.`order_product` ( `time_order`, `total_price`, `account_id`) VALUES
 ( '2023-04-19 10:30:00', 500000, 1),
 ( '2023-04-19 12:00:00', 1000000, 2),
 ('2023-04-19 14:30:00', 1000000,3), 
 ( '2023-04-19 16:00:00', 1200000, 3),
 ('2023-04-19 18:30:00', 480000, 2);
 
 INSERT INTO `thy_thu_project`.`order_detail` (`quantity`, `order_id`, `product_id`) VALUES 
(2, 1, 3),
 (1, 2, 3),
 (3, 3, 2),
 (2, 1, 2), 
 (4, 4, 1); 
 
 INSERT INTO `thy_thu_project`.`cart` (`quantity`, `account_id`, `product_id`) VALUES 
(2, 1, 3),
(1, 2, 1),
(3, 3, 2),
(2, 1, 4), 
(4, 2, 2);
