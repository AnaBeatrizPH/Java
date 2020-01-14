import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class CProduto {

	public static void main(String[] args) {
		CadastroP lista[] = new CadastroP[5];
		int posicao;
		int cont;

		Scanner teclado = new Scanner(System.in);
		posicao = 0;
		cont = 1;

		do {

			try {
				System.out.println("---Posição " + posicao);
				CadastroP p = new CadastroP();
				
				System.out.println("Digite o ID do produto");
				int id = Integer.parseInt(teclado.nextLine());
				p.setId(id);
				
				System.out.println("Digite o nome do produto");
				String nome = teclado.nextLine();
				p.setNome(nome);
				
				System.out.println("Digite os detalhes do produto");
				String detalhes = teclado.nextLine(); 
				p.setDetalhes(detalhes);
				
				System.out.println("Digite o Preço do produto");
				float preco = Float.parseFloat(teclado.nextLine()); 
				p.setPreco(preco);
				
				System.out.println("Digite a quantidade em estoque");
				float quantidade = Float.parseFloat(teclado.nextLine()); 
				p.setQuantidade(quantidade);

				posicao++;

			} catch (Exception ex) {
				System.out.println("Erro ao cadastrar");
				System.out.println("Motivo " + ex.getMessage());
			}

		} while (cont <= 5);

		teclado.close();

	}

}
