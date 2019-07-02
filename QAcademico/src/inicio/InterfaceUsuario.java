package inicio;

import java.util.Scanner;

import entidades.*;

		//quero que nessa classe fique todos os menus
		// na main é pra ficar só as chamadas de metodos
public class InterfaceUsuario {
	
	//metodo com o primeiro menu de terminal
	public void menuInicial(Professor professor) {
		System.out.println("Ola professor " + professor.getNome());
		System.out.println("Essas são suas turmas:");
		System.out.println();
		professor.mostrarTurmas();
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		System.out.println("Digite o numero da opcao que deseja:");
		System.out.println("1 - Ver uma Turma");
		System.out.println("2 - Adicionar uma Turma");
		System.out.println("3 - Excluir uma Turma");
		System.out.println("0 - Sair");
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
			
		boolean done = false;
		Scanner entradaTeclado = new Scanner(System.in);
		int opcaoMenu = entradaTeclado.nextInt();
		
		while(!done) {
		
		if (!Character.isDigit(opcaoMenu)) 
        {                         
            switch(opcaoMenu){
            case 1:
    			System.out.println("Digite o numero da turma que deseja ver:");
    			professor.mostrarTurmas();
    			System.out.println();
    			System.out.println("--------------------");
    			System.out.println();
    			int escolhaTurma = entradaTeclado.nextInt();
    			professor.exibirTurma(escolhaTurma - 1);
    			break;
    			
    		case 2:
    			System.out.println("Digite o nome da turma:");
    			String nomeTurma = entradaTeclado.next();
    			Turma nTurma = new Turma(nomeTurma, professor);
    			professor.adicionarTurma(nTurma);
    			System.out.println();
    			System.out.println("--------------------");
    			System.out.println();
    			System.out.println("Turma criada com sucesso!");
    			break;
    			
    		case 3:
    			System.out.println("Digite o numero da turma que voce deseja remover:");
    			professor.mostrarTurmas();
    			int numeroTurma = entradaTeclado.nextInt();
    			professor.removerTurma(numeroTurma);
    			System.out.println();
    			System.out.println("--------------------");
    			System.out.println();
    			System.out.println("Turma excluida com sucesso!");
            case 0:
                done = true;
                break;
                
            default:                            
                System.out.println("*** OPÇÃO INVÁLIDA ***");
            }                            
        }else{
            System.out.println("*** OPÇÃO INVÁLIDA ***");
             }
		
    }  
	entradaTeclado.close();	
} 
	
	public void menuTurma(Turma aTurma) {
		System.out.println("Digite o que voce deseja fazer com a turma:");
		aTurma.mostrarAlunosTurma();
		
	}
	
	}
