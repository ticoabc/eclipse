package livraria;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new Livro();
		livro.adicionaValor(59.90);

		//System.out.println("Valor atual: " + livro.getValor());	
		
		if (!livro.aplicaDescontoDe(0.3)) {
		System.out.println("Desconto não pode ser maior do que 30%");
		} else {
		System.out.println("Valor do Livro com desconto: " 
				+ livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no Ebook não pode ser "
				+ "maior do que 15%");
		} else {
			System.out.println("Valor do Ebook com desconto: " 
				+ ebook.getValor());
		}
	}
}

///////////Fim da Classe////////////////

//livro.valor -= livro.valor * 0.4;
/*if (!livro.aplicaDescontoDe(0.4)) {
System.out.println("Desconto não pode ser maior do que 30%");
} else {
System.out.println("Valor com desconto: " + livro.valor);
}*/