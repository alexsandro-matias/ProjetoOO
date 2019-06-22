package entidades;

public abstract class Pessoa
{
	private String nome;
	private String matricula;
	// public Pessoa(String nome)
	// {
	// super();
	// this.setNome(nome);
	// this.setMatricula(matricula);
	// }

	public Pessoa()
	{
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getMatricula()
	{
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}
	
	
}
