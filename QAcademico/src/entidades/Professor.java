package entidades;

public class Professor extends Pessoa {

	public Professor(String nome) {
		super(nome);
	}

	Aluno qualquerAluno = new Aluno(getNome());

	public void lancarNota(Aluno aluno) {

		System.out.println("Aluno: " + qualquerAluno.getNome());
		System.out.println("Nota : " + qualquerAluno.notaAluno.calculaMedia());

	}
	
	
	Disciplina disciplinaAluno = new Disciplina();
	
	public void lancarNota(Aluno aluno, Disciplina disciplina ) {
		
		System.out.println("Aluno: " + qualquerAluno.getNome());
		System.out.println("Disciplina: " + qualquerAluno.getNome());
		System.out.println("Nota : " + qualquerAluno.notaAluno.calculaMedia());
		
	}

}
