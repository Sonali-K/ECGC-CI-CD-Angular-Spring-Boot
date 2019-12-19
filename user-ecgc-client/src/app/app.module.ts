import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EcgcComponent } from './ecgc/ecgc.component';
import { SearchDeleteComponent } from './search-delete/search-delete.component';
import { UserEcgcService } from './user-ecgc.service';
import {HttpClientModule} from '@angular/common/http';
import{ FormsModule } from  '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    EcgcComponent,
    SearchDeleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [UserEcgcService],
  bootstrap: [AppComponent]
})
export class AppModule { }
