package entidades;

public class NotaDeProva
{
	private double nota1, nota2, media;

	// Cálculo da média
	public double setMedia(double nota1, double nota2)
	{
		return this.media = (nota1 + nota2) / 2;
	}

	public double setMedia()
	{
		return this.media = getNota1() + getNota2();
	}

	//
	// Getters & Setters
	public double getNota1()
	{
		return nota1;
	}

	public void setNota1(double nota1)
	{
		this.nota1 = nota1;
	}

	public double getNota2()
	{
		return nota2;
	}

	public void setNota2(double nota2)
	{
		this.nota2 = nota2;
	}

	public double getMedia()
	{
		return media;
	}
}
