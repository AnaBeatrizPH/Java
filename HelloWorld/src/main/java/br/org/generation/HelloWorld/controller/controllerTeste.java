package br.org.generation.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; //importado do RestController

@RestController //classe que será chamada atraves de URL
public class controllerTeste {
	
	@GetMapping("/Hello") // rota
	public String sayHello() {
	return "Hello World! Nosso primeiro projeto SpringBoot";
	}
	
	@GetMapping("/bye")
	public String sayBye() {
		return "Good Bye! See you later"; 
	}
	

}
