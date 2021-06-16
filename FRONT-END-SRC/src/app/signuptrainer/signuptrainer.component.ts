import { Component, OnInit } from '@angular/core';
import { Trainer } from '../trainer';
import { TrainerService } from '../trainer.service';

@Component({
  selector: 'app-signuptrainer',
  templateUrl: './signuptrainer.component.html',
  styleUrls: ['./signuptrainer.component.css']
})
export class SignuptrainerComponent implements OnInit {

  user: Trainer=new Trainer("","",0,"");
  message:any;
  constructor(private service:TrainerService) { }

  ngOnInit(): void {
    
  }
  public registerNow(){
    let resp=this.service.doRegistration(this.user);
    resp.subscribe((data)=>this.message=data);
      }
    
}
