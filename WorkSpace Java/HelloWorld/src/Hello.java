
public class Hello {

	public static void main(String args []) { // main must be void and public  

		/*int v1,v2; 
		
		v1 = Integer.parseInt(args[0]); 
		v2 = Integer.parseInt(args[1]); 
		
		int res= v1 + v2; 
		System.out.println("valor somado " + res);*/
		
		float salarioMinimo, qtdeKw, rsKw, vPago, desconto; 
		
		salarioMinimo = Float.parseFloat(args[0]); // even defined the conversion is required
		qtdeKw = Float.parseFloat(args[1]);
		
		rsKw = salarioMinimo/7 / 100; 
		vPago = rsKw * qtdeKw; 
		desconto = vPago*0.9f; 
		
		System.out.println("Valor de 1 KW é " + rsKw);
		System.out.println("Valor a ser pago é: " + vPago);
		System.out.println("Valor com o desconto é: " + desconto);
		
		
		
		
		
		
		
		
		
		
	}
	
}
