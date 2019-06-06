package entidades;

public class Professor extends Pessoa implements Funcionario
{
	
//	public Professor(String nome)
//	{
//		super(nome);
//	}

//	Aluno qualquerAluno = new Aluno();

//	public void lancarNota(Aluno aluno)
//	{
//		System.out.println("Aluno: " + qualquerAluno.getNome());
//		System.out.println("Nota : " + qualquerAluno.notaAluno.calculaMedia());
//	}

//	public void lancarNota(Aluno aluno, Disciplina disciplina)
//	{
//		System.out.println("Aluno: " + qualquerAluno.getNome());
//		System.out.println("Disciplina: " + qualquerAluno.getNome());
//		System.out.println("Nota : " + qualquerAluno.notaAluno.calculaMedia());
//	}
	
	public String avaliarDiariamenteAluno(Aluno alunoAvaliado, int nota)
	{
		String avaliacaoDiaria ="";
		
		if (nota == 2)
		{
			return avaliacaoDiaria = "Regular";
		}
		else if (nota == 1)
		{
			return avaliacaoDiaria = "Ruim";
		}
		else if (nota == 3)
		{
			return avaliacaoDiaria = "Bom";
		}
		else if (nota == 4)
		{
			return avaliacaoDiaria = "Ótimo";
		}
		return avaliacaoDiaria;
	}

	Disciplina disciplinaAluno = new Disciplina();

}
