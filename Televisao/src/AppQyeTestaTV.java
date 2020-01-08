import java.util.Scanner; 

public class AppQyeTestaTV {
	// the logic is only in here
public static void main(String args[]) {
	//it doesn't need to import - Java does it itself
	
	Scanner teclado = new Scanner(System.in); 
	
	int opcao; 
	Televisao t1; // I declared that t1 will "manipulate" a TV
	//t1 = new Televisao();  // I save a space in the memory for that
	t1 = new Televisao("Sony", 110, 32); 
	
	t1 = new Televisao("LG", 220, 34, 5);
	
	t1.setMarca("Sony"); 
	t1.setVoltagem(110); 
	t1.setTamanho(32); 
	t1.setLigada(false); 
	t1.setCanal(5); 
	t1.setVolume(2); 
	
	t1.SwitchPower(); 
	
	do {
		System.out.println(" Controle Remoto da TV ");
		System.out.println(" 1 - Ligar/Desligar");
		System.out.println(" 2 - Aumentar Volume");
		System.out.println(" 3 - Diminuir Volume");
		System.out.println(" 4 - Avancar Canal ");
		System.out.println(" 5 - Voltar Canal ");
		System.out.println("0 - Encerrar Sistema");
		opcao = teclado.nextInt(); 
		
		// logic's options 
		
		switch(opcao) {
		case 1: 
			t1.SwitchPower();
			break; 
		case 2: 
			t1.aumentarVolume();
			break; 
		case 3: 
			t1.diminuirVolume();
			break; 
		case 4: 
			t1.avancarCanal();
			break; 
		case 5:
			t1.voltaCanal();
			break; 
		}
		
		System.out.println();
	} while (opcao != 0); 
	
	
	
	teclado.close();
	
}
	
	
	
	
}
