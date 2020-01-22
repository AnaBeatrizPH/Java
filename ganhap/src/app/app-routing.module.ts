import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './componente/login/login.component';
import { ListagemComponent } from './componente/listagem/listagem.component';
import { LogoutComponent } from './componente/logout/logout.component';


const routes: Routes = [
  {path: "", redirectTo: 'login', pathMatch: 'full'}, 
  {path: 'login', component: LoginComponent}, 
 
  {path: 'lista', component: ListagemComponent}, 
  {path: 'logout', component: LogoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
