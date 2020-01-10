
public class qDicas extends questoes {

	private String dicas; 
	
	public qDicas(String enunciado, String resposta, String dicas) {
		
		super(enunciado, resposta);
		this.dicas = dicas; 
	}

	public String getDicas() {
		return dicas;
	}

	public void setDicas(String dicas) {
		this.dicas = dicas;
	}
	
public void exibe() {
		
		System.out.println(this.enunciado);
				
	}
	
public boolean corrige (String resp) {
	
	if (this.resposta == resp ) {
		System.out.println("Sua resposta está correta");
		return true; 
		
	}
	System.out.println("Sua resposta está incorreta");
	return false; 
	
	
}
	
}
