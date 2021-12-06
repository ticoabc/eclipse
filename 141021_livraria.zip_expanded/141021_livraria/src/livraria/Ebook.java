package livraria;

public class Ebook extends Livro {
	
	private String waterMark;
	
	public Ebook (Autor autor) {
		super (autor);
	}
	/*@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if ( porcentagem > 0.3 ) {
			return false;
		}
		
		double desconto = this.getValor() * porcentagem;
			this.setValor(this.getValor() - desconto);
				return true;		 
		}*/
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if ( porcentagem > 0.15 ) {
			return false;
		}		
		return super.aplicaDescontoDe(porcentagem);		 
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}	
}