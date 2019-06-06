package inicio;

import entidades.Aluno;
import entidades.Professor;

public class Inicio
{
	public static void main(String[] args)
	{
		Aluno alexsandro = new Aluno();
		alexsandro.setMatricula("20161y6-RC0050");
		alexsandro.setNome("Alexsandro Matias de Almeida");
		Professor paulo = new Professor();
		paulo.setNome("Paulo Abadie Guedes");
		paulo.setMatricula("20003y6-PROF001");
		System.out.println(alexsandro.getNome());
	}
}
