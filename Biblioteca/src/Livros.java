
public class Livros {

	private String titulo; 
	private String autor; 
	private int ano; 
	private String categoria; 
	private int nEstante; 
	private int nPrateleira; 
	private boolean emprestimo;
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getnEstante() {
		return nEstante;
	}
	public void setnEstante(int nEstante) {
		this.nEstante = nEstante;
	}
	public int getnPrateleira() {
		return nPrateleira;
	}
	public void setnPrateleira(int nPrateleira) {
		this.nPrateleira = nPrateleira;
	}
	public boolean isEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	} 
	
	
	void emprestaLivro() {
		if (emprestimo == false) {
			emprestimo = true; 
			
		} 
		else {
			emprestimo = false; 
			System.out.println("O Livro já está emprestado");
		}
	}
	
	
	
	
}
