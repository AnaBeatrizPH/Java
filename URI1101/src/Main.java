import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int M, N;

		M = teclado.nextInt();
		N = teclado.nextInt();

		while (M > 0 && N > 0) {
			int maior = M;
			int menor = N;
			if (M < N) {
				maior = N;
				menor = M;
			}
			
			int sum = 0;
			
			for (int cont=menor; cont<=maior; cont++) {
				System.out.print(cont + " ");
				sum = sum +cont; 
			}
			
			System.out.println("Sum=" + sum);
			M = teclado.nextInt();
			N = teclado.nextInt();
			
		}

		teclado.close();

	}
}
