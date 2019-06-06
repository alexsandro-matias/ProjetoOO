package entidades;

public enum Avaliacao
{
	ruim(1, "Ruim"), regular(2, "Regular"), bom(3, "Bom"), otimo(4, "Ótimo");
	
	public int codigoAvaliacao;
	public String descricao;
	
	Avaliacao()
	{
		this(2, "Regular");
	}

	Avaliacao(int codigo, String algumaDescricao)
	 {
		 codigoAvaliacao = codigo;
		 descricao = algumaDescricao;
	 }
	
}
