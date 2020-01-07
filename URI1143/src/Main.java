import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int N = teclado.nextInt(); 
		
		
		for(int cont = 1; cont<=N; cont++) {
			int quadrado = (int)Math.pow(cont, 2); 
			int cubo = (int)Math.pow(cont, 3);
			System.out.println(cont + " " + quadrado + " " + cubo);
		}
		
		
		teclado.close();
	}

 
}
