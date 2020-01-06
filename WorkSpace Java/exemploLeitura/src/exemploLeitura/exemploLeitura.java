package exemploLeitura; 
import java.util.Scanner; //import this class is required 


public class exemploLeitura {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in); 
		
		int a; 
		float b; 
		String texto; 
		
		System.out.println("Digite um nome");
		texto = teclado.nextLine(); 
		System.out.println("Digite um valor inteiro "); 
		a = teclado.nextInt(); 
		System.out.println("Digite um valor real "); 
		b = teclado.nextFloat(); 
		
		System.out.println("Você digitou os valores: " +  texto + a + b); 
		teclado.close();
		

	}

}
