package entidades;

import java.util.ArrayList;

public class Professor extends Pessoa implements Funcionario
{
	Disciplina disciplinaAluno = new Disciplina();
	ArrayList<Turma> listaTurmas = new ArrayList<>();

	public void lancarMedia(Aluno aluno)
	{
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Nota : " + aluno.notaAluno.calculaMedia());
	}

	public ArrayList<Turma> adicionarTurma(Turma novaTurma)
	{
		listaTurmas.add(novaTurma);
		return listaTurmas;
	}

	public ArrayList<Turma> removerTurma(int rTurma)
	{
		listaTurmas.remove(rTurma);
		return listaTurmas;
	}

	public void mostrarTurmas()
	{
		for (int i = 0; i < listaTurmas.size(); ++i)
		{
			Turma listTurma = listaTurmas.get(i);
			System.out.print(i + 1 + " - ");
			System.out.println(listTurma.getNome());
		}
	}

	public void exibirTurma(int nTurma)
	{
		Turma turmaEscolhida = listaTurmas.get(nTurma);
		turmaEscolhida.mostrarAlunosTurma();
	}
}
