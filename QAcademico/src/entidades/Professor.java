package entidades;

import java.util.ArrayList;

public class Professor extends Pessoa implements Assalariado
{
	Disciplina disciplinaAluno = new Disciplina();
	ArrayList<Turma> listaTurmas = new ArrayList<>();

	public void lancarNota(Aluno aluno)
	{
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Nota : " + aluno.notaAluno.setMedia());
	}

	public ArrayList<Turma> adicionarTurma(Turma novaTurma)
	{
		listaTurmas.add(novaTurma);
		return listaTurmas;
	}

	public ArrayList<Turma> removerTurma(int removerTurma)
	{
		listaTurmas.remove(removerTurma);
		return listaTurmas;
	}

	public void mostrarTurmas()
	{
		System.out.println("Turmas: ");
		
		for (int i = 0; i < listaTurmas.size(); i++)
		{
			System.out.println(this.listaTurmas.toString());
			
//			Turma listTurma = listaTurmas.get(i);
//			System.out.print(i + 1 + " - ");
//			System.out.println(listTurma.getNome());
		}
	}

	public boolean exibirTurma(int nTurma)
	{
		Turma turmaEscolhida = listaTurmas.get(nTurma);
		turmaEscolhida.mostrarAlunosTurma();
		return true;
	}

	@Override public double receberSalario(double salario)
	{
		return 0;
	}
}
