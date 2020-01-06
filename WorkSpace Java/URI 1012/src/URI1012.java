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
		
		
				
		//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		
		System.out.printf("TRIANGULO: %.3f%n" ,  triangulo); 
		
		// b) a �rea do c�rculo de raio C. (pi = 3.14159)
		
		System.out.printf("CIRCULO: %.3f%n" , circulo); 
		
		//c) a �rea do trap�zio que tem A e B por bases e C por altura.
		
		System.out.printf("TRAPEZIO: %.3f%n" , trapezio); 
		
		//d) a �rea do quadrado que tem lado B.
	
		System.out.printf("QUADRADO: %.3f%n" , quadrado); 
		
		//e) a �rea do ret�ngulo que tem lados A e B.
		System.out.printf("RETANGULO: %.3f%n", retangulo); 
		
		teclado.close();
	}
	
	
	
	
	
}
