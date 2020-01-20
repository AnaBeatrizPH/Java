package generation.org.br.crudTeste.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import generation.org.br.crudTeste.bd.veiculoBD;
import generation.org.br.crudTeste.model.veículo;

@RestController
public class veiculoController {

	private veiculoBD bdv = new veiculoBD();

	@PostMapping("/veiculo/novo")
	public ResponseEntity<veículo> novoVeiculo(@RequestBody veículo veic) {
		bdv.gravar(veic);
		return ResponseEntity.ok(veic);
	}

	@GetMapping("/veiculo/{id}")
	public ResponseEntity<veículo> getVeiculo(@PathVariable int id) { // Path para passar o ID
		veículo v = bdv.buscar(id);
		if (v != null) {
			return ResponseEntity.ok(v);
		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@GetMapping("/veiculo/todos")
	public ResponseEntity<ArrayList<veículo>> getTodos() {
		return ResponseEntity.ok(bdv.buscarTodos());
	}

	@PutMapping("/veiculo")
	public ResponseEntity<String> alteraVeiculo(@RequestBody veículo v) {
		bdv.atualiza(v);
		return ResponseEntity.ok("Success");
	}

	@DeleteMapping("/deleta/veiculo/{id}")
	public ResponseEntity<String> removeVeiculo(@PathVariable int id) {
		if (bdv.apagar(id)) {
			return ResponseEntity.ok("Deleted");
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}

/*
 * @GetMapping() public veículo testeVeiculo() { veículo v = new veículo();
 * v.setId(1234); v.setMarca("Volskwagen"); v.setCor("Preto");
 * v.setPreco(115120); v.setModelo("fusca"); v.setAno(1973);
 * v.setTipo("clássico de duas portas"); v.
 * setDetalhes("Fusca preto com interior reformado em tons de pink, banco de couro, camera de ré, ar condiconado"
 * );
 * 
 * return v;
 * 
 * }
 */
