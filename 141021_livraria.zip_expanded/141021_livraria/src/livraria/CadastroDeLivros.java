package livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		///Cadastro quando os atributos de livro são PRIVATE////
		Autor autor = new Autor();
		autor.setNome( "Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.00");
		
		///Cadastro quando os atributos de livro são PRIVATE////
		//Livro livro = new Livro();
		Livro livro = new Livro(autor);
		livro.setNome("Java 8 Pratico");
		livro.setDescricao("Novos recursos");
		livro.setValor(59.90);
		//livro.setIsbn("978-85-66250-46-6");
		
		
		livro.setAutor(autor);	
		
		livro.mostrarDetalhes();
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Outro Autor");
		outroAutor.setEmail("outroautor@caelum.com.br");
		outroAutor.setCpf("321.654.789.00");		
		
		//Livro outroLivro = new Livro();
		Livro outroLivro = new Livro(outroAutor);
		outroLivro.setNome("Java Praticidade");
		outroLivro.setDescricao("Novos Desafios");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");	
		
		//outroLivro.setAutor(outroAutor);
		
		outroLivro.mostrarDetalhes();		

	}
}

///Cadastro quando os atributos de livro são PUBLIC////
/*livro.adicionarNome("Java 8 Pratico");
//livro.nome = " Java 8 Pratico";
livro.descricao = "Novos recursos";
//livro.valor = 59.90;
livro.setValor(59.90);
livro.isbn = "978-85-66250-46-6";		
livro.autor = autor;*/

/*outroAutor.nome = "Outro Autor";
outroAutor.email = "outroautor@caelum.com.br";
outroAutor.cpf = "321.654.789.00";*/

/*outroLivro.adicionarNome("Java Praticidade");
//outroLivro.nome = "Java Praticidade";
outroLivro.descricao = "Novos Desafios";
outroLivro.setValor(59.90);
//outroLivro.valor = 59.90;
outroLivro.isbn = "978-85-66250-22-0";*/

