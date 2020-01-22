import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'; 


@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  constructor(private http: HttpClient) { }

  public getAllProdutos(){
    let token = localStorage.getItem("anaToken"); 
    return this.http.get("http://localhost:8080/produto/todos?token="+token); // para ver se a pessoa está logada
  }

}
