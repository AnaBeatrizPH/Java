
public class questoes {

	protected String enunciado; 
	protected String resposta; 
	
	public questoes (String enunciado, String resposta){
		
		this.enunciado= enunciado; 
		this.resposta= resposta; 
				
	}
	
	
	
	public String getEnunciado() {
		return enunciado;
	}



	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}



	public String getResposta() {
		return resposta;
	}



	public void setResposta(String resposta) {
		this.resposta = resposta;
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
