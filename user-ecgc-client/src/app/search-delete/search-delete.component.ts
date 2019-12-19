import { Component, OnInit } from '@angular/core';
import { UserEcgcService } from '../user-ecgc.service';

@Component({
  selector: 'app-search-delete',
  templateUrl: './search-delete.component.html',
  styleUrls: ['./search-delete.component.css']
})
export class SearchDeleteComponent implements OnInit {

  users:any;
  bankBranchName:string;
  constructor(private service:UserEcgcService) { }


   public deleteBankDataById(id:number)
   {
    let resp= this.service.deleteBankData(id);
    resp.subscribe((data)=>this.users=data);
   }

   public findeBankDataBankDataByBankBranchName(bankBranchName)
   {
    let resp= this.service.getBankDataByBankBranchName(this.bankBranchName);
    resp.subscribe((data)=>this.users=data);
   }

  ngOnInit() {

  let rep = this.service.getAllBankData();
  rep.subscribe((data)=>this.users=data);
  }

}
