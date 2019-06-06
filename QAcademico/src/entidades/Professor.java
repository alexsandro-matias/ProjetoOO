package entidades;

public class Professor extends Pessoa implements Funcionario
{
	// public Professor(String nome)
	// {
	// super(nome);
	// }
	// Aluno qualquerAluno = new Aluno();
	public void lancarNota(Aluno aluno)
	{
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Nota : " + aluno.notaAluno.calculaMedia());
	}

	// public void lancarNota(Aluno aluno, Disciplina disciplina)
	// {
	// System.out.println("Aluno: " + qualquerAluno.getNome());
	// System.out.println("Disciplina: " + qualquerAluno.getNome());
	// System.out.println("Nota : " + qualquerAluno.notaAluno.calculaMedia());
	// }
	public String avaliarDiariamenteAluno(String matricula, Avaliacao nota)
	{
		System.out.println(matricula);
		System.out.println(nota);
		if (nota.equals(Avaliacao.ruim))
		{
			
		}
		
		else if (nota.equals(Avaliacao.regular))
		{
		}
		else if (nota.equals(Avaliacao.bom))
		{
		}
		else if (nota.equals(Avaliacao.otimo))
		{
		}
		else
		{
			System.out.println("Avaliação inválida");
		}
		return "";
	}

	Disciplina disciplinaAluno = new Disciplina();
}
