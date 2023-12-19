import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignComponent } from './sign/sign.component';

export const routes: Routes = [{path:"",pathMatch:'full',redirectTo:'login'},
{path:'login',component:LoginComponent},
{path:'sign',component:SignComponent},];
