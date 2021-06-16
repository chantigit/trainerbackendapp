import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowtrainersComponent } from './showtrainers/showtrainers.component';
import { SignuptrainerComponent } from './signuptrainer/signuptrainer.component';

const routes: Routes = [
   {path:"",redirectTo:"register",pathMatch:"full"},
   {path:"register",component:SignuptrainerComponent},
   {path:"show",component:ShowtrainersComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
