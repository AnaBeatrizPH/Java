import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int N = teclado.nextInt();
		int quantidade[] = new int[N];
		int sum = 0; 
				
		
		for (int cont = 0; cont < quantidade.length; cont++) {
			quantidade[cont] = teclado.nextInt();
		}
		
		for (int cont = 0; cont < quantidade.length; cont++) {
			for(int i=1; i<=quantidade[cont]; i++) {
				if (quantidade[cont]%i==0) {
					sum++; 
				}
			}
			
			if(sum==2) {
				System.out.printf("%d eh primo%n", quantidade[cont]);
			}
			else {
				System.out.printf("%d nao eh primo%n", quantidade[cont]);
			}
			sum=0;
		}
		
		teclado.close();
		
	}
}


