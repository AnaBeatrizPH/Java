import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'; 
import {FormsModule} from '@angular/forms'


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './componente/navbar/navbar.component';
import { TituloComponent } from './componente/titulo/titulo.component';
import { LoginComponent } from './componente/login/login.component';
import { LogoutComponent } from './componente/logout/logout.component';
import { ListagemComponent } from './componente/listagem/listagem.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    TituloComponent,
    LoginComponent,
    LogoutComponent,
    ListagemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    HttpClientModule, 
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
