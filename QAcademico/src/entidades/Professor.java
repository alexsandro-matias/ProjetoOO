package entidades;

public class Professor extends Pessoa {
	

	public Professor(String nome) {
		super(nome);
	}



	Aluno qualquerAluno = new Aluno(getNome());
	


	public void lancarNota(Aluno aluno) {
		System.out.println("Aluno: "+qualquerAluno.getNome());
		System.out.println("Nota : "+qualquerAluno.notaAluno.calculaMedia(nota1, nota2));

	}

}
