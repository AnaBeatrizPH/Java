package generation.org.br.crudTeste.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity; // status http
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import generation.org.br.crudTeste.bd.BDCliente;
import generation.org.br.crudTeste.model.cliente;

@RestController
public class clienteController {

	private BDCliente bd = new BDCliente(); // criaçao do nosso "banco de dados"

	@PostMapping("/cliente/novo")
	public ResponseEntity<cliente> novoCliente(@RequestBody cliente cliente) {
		bd.gravar(cliente);
		return ResponseEntity.ok(cliente);
	}

	@GetMapping("/cliente/{id}")
	public ResponseEntity<cliente> getCliente(@PathVariable int id) { // Path para passar o ID
		cliente cli = bd.buscar(id);
		if (cli != null) {
			return ResponseEntity.ok(cli);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<cliente>> getTodos() {
		return ResponseEntity.ok(bd.buscarTodos());
	}

	@PutMapping("/cliente")
	public ResponseEntity<String> alteraCliente(@RequestBody cliente c) {
		bd.atualiza(c); 
		return ResponseEntity.ok("Success");
	}

	@DeleteMapping("/deleta/cliente/{id}")
	public ResponseEntity<String> removeCliente(@PathVariable int id) {
		if (bd.apagar(id)) {
			return ResponseEntity.ok("Deleted");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
}

	
	//@GetMapping("/cliente/teste")
	//public ResponseEntity<cliente> testeCliente() {  response da status http
		//cliente c = new cliente();
		
		//c.setId(5658);
		//c.setCpf("4569632587");
		//c.setDataNasc("20/01/1994");
		//c.setEmail("thiagomauricinho@bol.com.br");
		//c.setNome("Thiaguinho da massa");
		//c.setTelefone("988577458");
		
		//return ResponseEntity.ok(c);
