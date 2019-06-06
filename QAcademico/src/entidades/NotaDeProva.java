package entidades;

public class NotaDeProva
{
	private double nota1, nota2, media;
	
	public double calculaMedia ()
	{
		return this.media = (nota1 + nota2)/2;
	}
	public double calculaMedia (double nota1, double nota2)
	{
		return this.media = (this.nota1 + this.nota2)/2;
	}

	
}
