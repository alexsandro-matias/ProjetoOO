package entidades;

public enum Avaliacao
{
	ruim(1), regular(2), bom(3), otimo(4);
	
	public int codigoAvaliacao;
	
	 Avaliacao(int codigo)
	 {
		 codigoAvaliacao = codigo;
		 
	 }
	
}
