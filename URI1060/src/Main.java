import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double num[] = new double[6];
		int pos = 0; 
				
		for(int cont = 0; cont<num.length; cont++) {
			num[cont]= teclado.nextDouble();
		}
		
		for(int cont =0; cont<num.length; cont++) {
			if(num[cont]>0) {
				pos++; 
			}
		}
		
		
		System.out.printf("%d valores positivos\n", pos);
		teclado.close(); 
	}

}
