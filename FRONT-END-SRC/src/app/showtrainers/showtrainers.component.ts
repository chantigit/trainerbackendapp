import { Component, OnInit } from '@angular/core';
import { Trainer } from '../trainer';
import { TrainerService } from '../trainer.service';

@Component({
  selector: 'app-showtrainers',
  templateUrl: './showtrainers.component.html',
  styleUrls: ['./showtrainers.component.css']
})
export class ShowtrainersComponent implements OnInit {
  users:any;
  x:string='HELLO';
  constructor(private service:TrainerService) 
  { 
    let resp=this.service.getTrainers();
    resp.subscribe((data)=>this.users=data);
  }

  ngOnInit(): void {
    
  }

}
