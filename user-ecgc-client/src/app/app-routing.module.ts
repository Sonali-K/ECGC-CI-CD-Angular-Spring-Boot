import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EcgcComponent } from './ecgc/ecgc.component';
import { SearchDeleteComponent } from './search-delete/search-delete.component';


const routes: Routes = [
{path:"",redirectTo:"enterdata",pathMatch:"full"},
{path:"enterdata",component:EcgcComponent},
{path:"searchdelete",component:SearchDeleteComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
