import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TrainerService {

  constructor(private http:HttpClient) { }

  public doRegistration(trainer:any){
    return this.http.post("http://localhost:9090/api/trainer/signup",trainer,{responseType:'text' as 'json'});
  }

  public getTrainers(){
    return this.http.get("http://localhost:9090/api/trainer/all");
  }
}
