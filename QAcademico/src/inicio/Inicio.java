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
		alexsandro.avaliarDia(0, 3);
		alexsandro.avaliarDia(1, 3);
		alexsandro.avaliarDia(2, 3);
		alexsandro.avaliarDia(3, 3);
		alexsandro.avaliarDia(4, 3);
		
		erivelton.setMatricula("20162y6-RC0040");
		erivelton.setNome("Erivelton Ribeiro da Silva Alves");
		erivelton.avaliarDia(0, 3);
		erivelton.avaliarDia(1, 3);
		erivelton.avaliarDia(2, 3);
		erivelton.avaliarDia(3, 3);
		erivelton.avaliarDia(4, 3);
		
		Professor paulo = new Professor();
		paulo.setNome("Paulo Abadie Guedes");
		paulo.setMatricula("20003y6-PROF001");
		
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(alexsandro);
		listaAlunos.add(erivelton);
		
		for (int i = 0; i < listaAlunos.size(); ++i) {
			Pessoa alunosTurma = listaAlunos.get(i);
			System.out.println(alunosTurma.getNome());
		}
		
		alexsandro.mostrarRelatorio();
		erivelton.mostrarRelatorio();
		
	}
}
