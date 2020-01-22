import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/Model/Usuario';
import { UsuarioService } from 'src/app/servico/usuario.service';
import { Router } from '@angular/router';

import { Token } from 'src/app/Model/Token'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  private mensagem: number;
  private usuario: Usuario = new Usuario();

  constructor(private srv: UsuarioService, private router: Router) {
    this.mensagem = 0; // se receber 0 está tudo certo 
  }

  ngOnInit() {

    if (localStorage.getItem("anaToken")) {
      this.router.navigate(['/lista']); // página que irá após o login ser efetuado
    }
  }


  enviarDados() {
    this.srv.autenticar(this.usuario).subscribe(
      (res: Token) => {
        localStorage.setItem("anaToken", res.strToken);
        this.mensagem = 0;
        this.router.navigate(['/lista']);

      },
      (err) => {
        this.mensagem = 1;
      }
    );
    }
  }
