import java.util.Scanner; 

public class AppLivros {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in); 
		
		int opcao = 0; 
		
		Livros l1; 
		l1 = new Livros(); 
		
		l1.setTitulo("Casa Grande E Senzala");
		l1.setAutor("Gilberto Freire"); 
		l1.setAno(1933);
		l1.setCategoria("Sociologia");
		l1.setnEstante(23);
		l1.setnPrateleira(2);
		l1.setEmprestimo(false);
		
		System.out.println("Título: " +l1.getTitulo());
		System.out.println("Autor: " +l1.getAutor()); 
		System.out.println("Ano de publicação: " + l1.getAno());
		System.out.println("Categoria: " + l1.getCategoria());
		System.out.println("Número da estante: " + l1.getnEstante());
		System.out.println("Número da prateleira: " + l1.getnPrateleira());
		System.out.println("Emprestado: " + l1.isEmprestimo());
		
		Livros l2; 
		l2 = new Livros();
		
		l2.setTitulo("Raízes do Brasil");
		l2.setAutor("Sérgio Buarque de Holanda ");
		l2.setAno(1936);
		l2.setCategoria("Sociologia");
		l2.setnEstante(23);
		l2.setnPrateleira(4);
		l2.setEmprestimo(false);
		
		System.out.println("Título: " +l2.getTitulo());
		System.out.println("Autor: " +l2.getAutor()); 
		System.out.println("Ano de publicação: " + l2.getAno());
		System.out.println("Categoria: " + l2.getCategoria());
		System.out.println("Número da estante: " + l2.getnEstante());
		System.out.println("Número da prateleira: " + l2.getnPrateleira());
		System.out.println("Emprestado: " + l2.isEmprestimo());
		
		switch(opcao) {
		case 1: 
			l1.emprestaLivro();
			break; 
		}
		
		
		teclado.close();
		}
	

	
}
