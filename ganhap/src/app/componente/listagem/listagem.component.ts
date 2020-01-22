import { Component, OnInit } from '@angular/core';
import { Produto } from 'src/app/Model/Produto';
import { ProdutoService } from 'src/app/servico/produto.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-listagem',
  templateUrl: './listagem.component.html',
  styleUrls: ['./listagem.component.css']
})
export class ListagemComponent implements OnInit {
  lista: Produto[]; 

  constructor(private srv: ProdutoService, private route: Router) { }

  ngOnInit() {
    if(localStorage.getItem("anaToken")){
      this.srv.getAllProdutos().subscribe(
        (res: Produto[]) => {
          this.lista=res; 
        },
        (err) =>{
          this.route.navigate(['/login']) // se não tiver token vá para a home
        }
      );
    }
    else{
      this.route.navigate(['/login']) // se der erro sem entrar no if
    }

  }

}
