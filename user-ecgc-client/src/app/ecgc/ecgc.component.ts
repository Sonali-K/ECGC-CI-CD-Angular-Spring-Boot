import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserEcgcService } from '../user-ecgc.service';

@Component({
  selector: 'app-ecgc',
  templateUrl: './ecgc.component.html',
  styleUrls: ['./ecgc.component.css']
})
export class EcgcComponent implements OnInit {

  user : User = new User(0,0,"","","");
  message:any;
  constructor(private service:UserEcgcService) { }

  ngOnInit() {
  }

  public enterBankDataNow()
  {
   let resp= this.service.enterBankData(this.user)
   resp.subscribe((data)=>this.message=data);
  }

}
