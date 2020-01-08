
public class Televisao {

	// TV's informations
	// won't have a Main - only ONE file will have a Main

	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;
	
	
	  public Televisao(String marca, int voltagem, int tamanho) {
		this.marca = marca; 
		this.voltagem = voltagem; 
		this.tamanho = tamanho; 
	  }
		
	 //developed of another constructor - only one difference and it works 
	  public Televisao(String marca, int voltagem, int tamanho, int canal) {
			this.marca = marca; 
			this.voltagem = voltagem; 
			this.tamanho = tamanho; 
			this.canal = canal; 
		  }
	  
	
	
	// To create a Method - parentheses witch can have parameter

	/*
	 * void ligar() { ligada = true; System.out.println("A TV " + marca +
	 * " está ligada ");}
	 */

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca; 
	}
	
	
	
	void SwitchPower() {
		ligada = !ligada;
		System.out.println("A TV " + marca + " está " + ((ligada) ? " ligada " : " desligada! "));
		// atribuidor ternário de atribuicao condicional
		/* (TesteLogico)? <ValoresSeTesteForVerdadeiro>: <ValorSeTesteForFalso> */
	}

	void aumentarVolume() {
		if (ligada == true) {
			if (volume < 10) {
				volume++;
				System.out.println("A TV " + marca + " está no volume " + volume);
			} else {
				System.out.println("A TV está no Volume máximo");
			}

		} else {
			System.out.println("Ligue a TV primeiro");
		}

	}

	void diminuirVolume() {

		if (ligada == true) {
			if (volume > 0) {
				volume--;
				System.out.println("A TV " + marca + " está no volume " + volume);
			} else {
				System.out.println("A TV está no MUDO");
			}

		} else {
			System.out.println("Ligue a TV primeiro");
		}

	}

	void avancarCanal() {

		if (ligada == true) {
			if (canal < 10) {
				canal++;
				System.out.println("A TV " + marca + " está no canal " + canal);
			} else {
				canal = 1;
				System.out.println("A TV " + marca + " está no canal " + canal);
			}
		} else {
			System.out.println("Ligue a TV primeiro");
		}

	}

	void voltaCanal() {

		if (ligada == true) {
			if (canal > 1) {
				canal--;
				System.out.println("A TV " + marca + " está no canal " + canal);
			} else {
				canal = 10;
				System.out.println("A TV " + marca + " está no canal " + canal);
			}

		} else {
			System.out.println("Ligue a TV primeiro");
		}

	}

}
