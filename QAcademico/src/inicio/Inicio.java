package inicio;

import java.util.ArrayList;

import entidades.Aluno;
import entidades.Avaliacao;
import entidades.Professor;
import entidades.Pessoa;

public class Inicio
{
	public static void main(String[] args)
	{
		// Banco de dados
		
		Aluno erivelton = new Aluno();
		Aluno alexsandro = new Aluno();
		alexsandro.setMatricula("20161y6-RC0050");
		alexsandro.setNome("Alexsandro Matias de Almeida");
		
		erivelton.setMatricula("20162y6-RC0040");
		erivelton.setNome("Erivelton Ribeiro da Silva Alves");
		
		Professor paulo = new Professor();
		paulo.setNome("Paulo Abadie Guedes");
		paulo.setMatricula("20003y6-PROF001");
		
//		System.out.println(alexsandro.getNome());
//		paulo.avaliarDiariamenteAluno(alexsandro.getMatricula(), Avaliacao.bom);
		
//		System.out.println(erivelton.getNome());
//		paulo.avaliarDiariamenteAluno(alexsandro.getMatricula(), Avaliacao.regular);
		
		ArrayList<Pessoa> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(alexsandro);
		listaAlunos.add(erivelton);
		
		for (int i = 0; i < listaAlunos.size(); ++i) {
			Pessoa alunosTurma = listaAlunos.get(i);
			System.out.println(alunosTurma.getNome());
			
		}
		
	}
}
