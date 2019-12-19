import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserEcgcService {

  constructor(private http:HttpClient) { }


  public enterBankData(user)
  {
    return this.http.post("http://localhost:8082/bank/save",user,{responseType: 'text' as 'json'});
  }


  public getAllBankData(){
     return this.http.get("http://localhost:8082/bank/findall");

  }
  
  public getBankDataByBankBranchName(bankBranchName)
  {
    return this.http.get("http://localhost:8082/bank/findc/"+bankBranchName);

  }

  public deleteBankData(id)
  {
    return this.http.get("http://localhost:8082/bank/delete/"+id);

  }

}
