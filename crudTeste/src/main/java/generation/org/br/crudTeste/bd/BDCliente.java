package generation.org.br.crudTeste.bd;

import java.util.ArrayList;

import generation.org.br.crudTeste.model.cliente;

public class BDCliente {
	
	private ArrayList<cliente> lista;
	
	public BDCliente() {
		lista = new ArrayList<cliente>(); 
	}
	
	public void gravar (cliente c) {
		this.lista.add(c); 
		
	}
	
	public cliente buscar(int id) {
		cliente c = null; 
		for (cliente cli: lista) {
			if (cli.getId() == id) {
				c = cli; 
				break;
			}
		}
		return c;
		
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
	
	
	
	public ArrayList<cliente> buscarTodos(){
		return lista;
	}
	
	public void atualiza(cliente c) {
		int posicao = -1; 
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getId() == c.getId()) {
				posicao = i; 
				break; 
			}
		}
		if(posicao >= 0) {
			lista.set(posicao, c);
		}
		
	}

}
