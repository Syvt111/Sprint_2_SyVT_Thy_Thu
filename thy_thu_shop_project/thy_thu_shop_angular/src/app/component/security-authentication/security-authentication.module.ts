import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SecurityAuthenticationRoutingModule } from './security-authentication-routing.module';
import {ReactiveFormsModule} from '@angular/forms';
import {ChangePasswordComponent} from './change-password/change-password.component';
import {LoginComponent} from '../login/login.component';
import {ForgotPasswordComponent} from './forgot-password/forgot-password.component';


@NgModule({
  declarations: [ChangePasswordComponent, ForgotPasswordComponent, LoginComponent],
  imports: [
    CommonModule,
    SecurityAuthenticationRoutingModule,
    ReactiveFormsModule
  ]
})
export class SecurityAuthenticationModule { }