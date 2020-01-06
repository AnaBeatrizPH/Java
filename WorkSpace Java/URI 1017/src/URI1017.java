import java.util.Scanner; 

public class URI1017 {

	public static void main(String[] args) {
		Scanner teclado; 
		teclado = new Scanner (System.in);
		
		int horas, km; 
		double resultado; 
		
		horas = teclado.nextInt();
		km = teclado.nextInt(); 
		
		resultado = (double) horas * km /12; 
		System.out.printf("%.3f%n", resultado); 
				
		
	 teclado.close(); 
	}
	
	
	
}
