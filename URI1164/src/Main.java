import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado;
		teclado = new Scanner(System.in);
		int N = teclado.nextInt();

		int quantidade[] = new int[N];
		int conta = 0;

		for (int cont = 0; cont < quantidade.length; cont++) {
			quantidade[cont] = teclado.nextInt();
		}

		for (int cont = 0; cont < quantidade.length; cont++) {
			for (int J = 1; J < quantidade[cont]; J++) {
				if (quantidade[cont] % J == 0) {
					conta += J;
				}
			}

			if (quantidade[cont] == conta) {
				System.out.printf("%d eh perfeito%n", quantidade[cont]);
			} else {
				System.out.printf("%d nao eh perfeito%n", quantidade[cont]);
			}
			conta = 0;
		}

		teclado.close();
	}
}
