package inicio;


import entidades.*;


public class Inicio
{
	public static void main(String[] args)
	{
		// Banco de dados
		
		Professor paulo = new Professor();
		paulo.setNome("Paulo Abadie Guedes");
		paulo.setMatricula("20003y6-PROF001");
		



		Aluno erivelton = new Aluno();
		Aluno alexsandro = new Aluno();
		alexsandro.setMatricula("20161y6-RC0050");
		alexsandro.setNome("Alexsandro Matias de Almeida");
		alexsandro.avaliarDia(1, 3);
		alexsandro.avaliarDia(2, 3);
		alexsandro.avaliarDia(3, 3);
		alexsandro.avaliarDia(4, 3);
		alexsandro.avaliarDia(5, 3);
		
		erivelton.setMatricula("20162y6-RC0040");
		erivelton.setNome("Erivelton Ribeiro da Silva Alves");
		erivelton.avaliarDia(1, 3);
		erivelton.avaliarDia(2, 3);
		erivelton.avaliarDia(3, 3);
		erivelton.avaliarDia(4, 3);
		erivelton.avaliarDia(5, 3);
					
//		alexsandro.mostrarRelatorio();
//		erivelton.mostrarRelatorio();
		
		Turma Turma1 = new Turma("lpoo", paulo);
		Turma1.matricularAluno(alexsandro);
		Turma1.matricularAluno(erivelton);
		
		paulo.adicionarTurma(Turma1);
		

		InterfaceUsuario menuTerminal = new InterfaceUsuario();
		menuTerminal.menuInicial(paulo);
		
	}
}
