import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		double A, B, C, temporario;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		

			if (B > A && B > C) {
			temporario = A;
			A = B;
			B = temporario;

		}
			else if (C > B && C > A) {
			temporario = A;
			A = C;
			C = temporario;
		}
			
			if (C>B) {
				temporario = B; 
				B = C; 
				C= temporario; 
			}
			
			if (A >= B+C) {
				System.out.println("NAO FORMA TRIANGULO"); 
			}
			
			else if(A*A == B*B + C*C) {
				System.out.println("TRIANGULO RETANGULO");
			}
			
			else if(A*A > B*B + C*C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			else if(A*A < B*B + C*C) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			 
			
			if(A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			else if (A == B || B == C || A == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
			
			teclado.close();
			
	}
	
	
}
