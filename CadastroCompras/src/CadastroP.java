
public class CadastroP {
	
	private int id; 
	private String nome; 
	private String detalhes; 
	private float preco;
	private float quantidade;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <=0) {
			throw new RuntimeException("O ID não pode ser menor ou igual a ZERO"); 
		}
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome == (" ")) {
			throw new RuntimeException("O campo do nome não deve ser vazio");
		}
		this.nome = nome;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		if(detalhes == null) {
			throw new RuntimeException("Descreva os detalhes do produto");
		}
		this.detalhes = detalhes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if (preco <=0) {
			throw new RuntimeException("O preço do produto deve ser maior que zero");
		}
		this.preco = preco;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		if (quantidade < 0 ) {
			throw new RuntimeException("A quantidade não pode ser negativa");
		}
		this.quantidade = quantidade;
	}
	
	

	
	
		
}
