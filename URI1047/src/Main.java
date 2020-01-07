import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int hI, mI, hF, mF, horaITotalMin, horaFTotalMin, duracaoMin, horasTotais, minutosTotais; 
		
		hI = teclado.nextInt(); 
		mI = teclado.nextInt(); 
		hF = teclado.nextInt(); 
		mF = teclado.nextInt(); 
		
		horaITotalMin = hI * 60 + mI; 
		horaFTotalMin = hF * 60 + mF; 
		
		if (horaFTotalMin > horaITotalMin) {
			duracaoMin = horaFTotalMin - horaITotalMin; 
		}
		
		else {
			duracaoMin = (24 * 60 - horaITotalMin) + horaFTotalMin; 
		}
		
		
		horasTotais = duracaoMin / 60; 
		minutosTotais = duracaoMin % 60; 
		
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horasTotais, minutosTotais); 
		
		
		teclado.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


