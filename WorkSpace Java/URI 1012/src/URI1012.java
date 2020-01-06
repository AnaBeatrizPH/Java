import java.util.Scanner; 

public class URI1012 {
	public static void main(String[] args) {
		
		Scanner teclado; 
		teclado = new Scanner (System.in);
		
		Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo; 
		
		
		A = teclado.nextDouble();  
		B = teclado.nextDouble(); 
		C = teclado.nextDouble(); 
		
		triangulo = A*C/2; 
		circulo = 3.14159 * (C*C); 
		trapezio = ((A + B)/2) * C; 
		quadrado = B * B; 
		retangulo = A * B; 
		
		
				
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		
		System.out.printf("TRIANGULO: %.3f%n" ,  triangulo); 
		
		// b) a área do círculo de raio C. (pi = 3.14159)
		
		System.out.printf("CIRCULO: %.3f%n" , circulo); 
		
		//c) a área do trapézio que tem A e B por bases e C por altura.
		
		System.out.printf("TRAPEZIO: %.3f%n" , trapezio); 
		
		//d) a área do quadrado que tem lado B.
	
		System.out.printf("QUADRADO: %.3f%n" , quadrado); 
		
		//e) a área do retângulo que tem lados A e B.
		System.out.printf("RETANGULO: %.3f%n", retangulo); 
		
		teclado.close();
	}
	
	
	
	
	
}
