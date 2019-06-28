package entidades;

import java.util.ArrayList;

public class Professor extends Pessoa implements Funcionario
{
	Disciplina disciplinaAluno = new Disciplina();
	ArrayList<Turma> listaTurmas = new ArrayList<>();
	
	public void lancarNota(Aluno aluno)
	{
		System.out.println("Aluno: " + aluno.getNome());
		System.out.println("Nota : " + aluno.notaAluno.calculaMedia());
	}

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

	public ArrayList<Turma> adicionarTurma(Turma novaTurma) {
		listaTurmas.add(novaTurma);
	 return listaTurmas;
	}
	
	public void mostrarTurmas() {
		for (int i = 0; i < listaTurmas.size(); ++i) {
			Turma listTurma = listaTurmas.get(i);
			System.out.println(listTurma.getNome());
		}
	}
}
