
public class qMultipla extends questoes {
	
	
	private String A, B, C, D;

	public qMultipla(String enunciado, String resposta, String a, String b, String c, String d) {
		super(enunciado, resposta);
		A = a;
		B = b;
		C = c;
		D = d;
	}

	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getD() {
		return D;
	}

	public void setD(String d) {
		D = d;
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
