package livraria;

public class Livro {
	
	private String nome;
	private String descricao;
	private double valor;
	private	String isbn;	
	private Autor  autor;
	
	public Livro(Autor autor) {
		this();
		this.autor = autor;
		//this.isbn  = "000-00-00000-00-0"; 
	}
	
	public Livro() {	
		
		this.isbn  = "000-00-00000-00-0";
	}
		
	/*public Livro() {	
		System.out.println("\nNovo Livro!!!");
	}*/
	
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public double getValor() {
		return valor;
	}	

	public String getIsbn() {
		return isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	void adicionarNome(String nome) {
		this.nome = nome;
	}
	
	void adicionaValor (double valor) {
		this.valor = valor;
	}
	
	double retornaValor() {
		return this.valor;	
		}	
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	void mostrarDetalhes() {
		
		System.out.println("\nMostrando Detalhes do Livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}		
		System.out.println("--");
	}	
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if ( porcentagem > 0.3 ) {
			return false;
		}
		
		this.valor -= this.valor * porcentagem;
			return true;		 
		}
}
///////////////////////////////////////////////////////////////////

//void adicionarValor(double valor) {
//	this.valor = valor;	}

	//double retornaValor() {
	//return this.valor;	}	

/*public boolean aplicaDescontoDe(double porcentagem) {
if ( porcentagem > 0.3 ) {
	return false;			
}

this.valor -= this.valor * porcentagem;
return true;
}*/	









