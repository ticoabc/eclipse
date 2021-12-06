package livraria;

public class ComparandoReferencias {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.00");	
		
		Autor autor2 = new Autor();
		autor2.setNome("Rodrigo Turini");
		autor2.setEmail("rodrigo.turini@caelum.com.br");
		autor2.setCpf("123.456.789.00");
		
		
		
		if( autor == autor2 ) {
			System.out.println("Iguais!");
		}else {
			System.out.println("Hã, não são iguais");
		}
	}
}
/////////////////////////////////////////////////////////

/*///Cadastro quando os atributos de livro são PUBLIC////
autor.nome = "Rodrigo Turini";
autor.email = "rodrigo.turini@caelum.com.br";
autor.cpf = "123.456.789.00";*/

/*autor2.nome = "Rodrigo Turini";
autor2.email = "rodrigo.turini@caelum.com.br";
autor2.cpf = "123.456.789.00";*/