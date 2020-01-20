package generation.org.br.crudTeste.bd;

import java.util.ArrayList;

import generation.org.br.crudTeste.model.veículo;

public class veiculoBD {

	private ArrayList<veículo> lista; 
	
	public void BDVeiculo() {
		lista = new ArrayList<veículo>();
		
	}
	
	public void gravar (veículo veic) {
		this.lista.add(veic);
	}
	
	
	public veículo buscar(int id) {
		veículo v = null; 
		for (veículo veic: lista) {
			if (veic.getId() == id) {
				v = veic; 
				break;
			}
		}
		return v;
		
	}
	
	public boolean apagar(int id) {
		int posicao =-1; 
		for (int i=0; i<lista.size(); i++) {
			if
				(lista.get(i).getId()==id){
					posicao = i; 
					break;
				}
			}
		if(posicao >=0) {
			lista.remove(posicao); 
			return true; 
		}
			return false;
	}
	
	public ArrayList<veículo> buscarTodos(){
		return lista;
	}
	
	public void atualiza(veículo v) {
		int posicao = -1; 
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getId() == v.getId()) {
				posicao = i; 
				break; 
			}
		}
		if(posicao >= 0) {
			lista.set(posicao, v);
		}
		
	}
	
	
	
	
}
