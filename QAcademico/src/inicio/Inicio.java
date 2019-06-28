package inicio;


import java.util.Scanner;

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
					
		alexsandro.mostrarRelatorio();
		erivelton.mostrarRelatorio();
		
		Scanner entradaTeclado = new Scanner(System.in);
		

		InterfaceUsuario menuTerminal = new InterfaceUsuario();
		menuTerminal.menuInicial(paulo);
		
		int opcaoMenu = entradaTeclado.nextInt();
		
	    do {
		
		switch(opcaoMenu) {
		case 1:
			paulo.mostrarTurmas();
			break;
			
		case 2:
			System.out.println("Digite o nome da turma:");
			String nomeTurma = entradaTeclado.next();
			Turma nTurma = new Turma(nomeTurma, paulo);
			paulo.adicionarTurma(nTurma);
			break;
			
		case 3:
			menuTerminal.menuInicial(paulo);
			break;
			
		default:
			System.exit(0);
		
		}
		} while (opcaoMenu != 0);
	}
}
