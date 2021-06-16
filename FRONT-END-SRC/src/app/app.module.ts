import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignuptrainerComponent } from './signuptrainer/signuptrainer.component';
import { ShowtrainersComponent } from './showtrainers/showtrainers.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { TrainerService } from './trainer.service';

@NgModule({
  declarations: [
    AppComponent,
    SignuptrainerComponent,
    ShowtrainersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [TrainerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
