package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Turma
{
	private String nome;
	private Date semestre;
	private Professor professor;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Turma(String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
	}
	
	ArrayList<Aluno> listaAlunos = new ArrayList<>();
	
	public ArrayList<Aluno> matricularAluno(Aluno novoAluno) {
		listaAlunos.add(novoAluno);
	 return listaAlunos;
	}
	
	public void mostrarAlunosTurma() {
		for (int i = 0; i < listaAlunos.size(); ++i) {
			Pessoa alunosTurma = listaAlunos.get(i);
			System.out.println(alunosTurma.getNome());
		}
	}
	
	
}
