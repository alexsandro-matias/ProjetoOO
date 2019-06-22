package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa
{
//	Date diaLetivo = null;
//	NotaDeProva notaAluno;
//	
//	Map<Date, Integer> historicoDeAvaliacoes;
//	
//	public Aluno()
//	{
//		historicoDeAvaliacoes = new HashMap<Date, Integer>();
//	}
	
//	ArrayList<Pessoa> listaAvaliacaoDiaria = new ArrayList<>();
	int[] listaAvaliacaoDiaria = new int[30];{
	
	listaAvaliacaoDiaria[0] = 2;
	listaAvaliacaoDiaria[1] = 2;
	listaAvaliacaoDiaria[2] = 2;
	listaAvaliacaoDiaria[3] = 1;
	listaAvaliacaoDiaria[4] = 2;
	listaAvaliacaoDiaria[5] = 2;
	listaAvaliacaoDiaria[6] = 4;
	listaAvaliacaoDiaria[7] = 2;
	listaAvaliacaoDiaria[8] = 2;
	listaAvaliacaoDiaria[9] = 4;
	listaAvaliacaoDiaria[10] = 2;
	listaAvaliacaoDiaria[11] = 2;
	listaAvaliacaoDiaria[12] = 3;
	listaAvaliacaoDiaria[13] = 2;
	listaAvaliacaoDiaria[14] = 3;
	listaAvaliacaoDiaria[15] = 2;
	listaAvaliacaoDiaria[16] = 4;
	listaAvaliacaoDiaria[17] = 2;
	listaAvaliacaoDiaria[18] = 2;
	listaAvaliacaoDiaria[19] = 1;
	listaAvaliacaoDiaria[20] = 2;
	listaAvaliacaoDiaria[21] = 1;
	listaAvaliacaoDiaria[22] = 2;
	listaAvaliacaoDiaria[23] = 2;
	listaAvaliacaoDiaria[24] = 2;
	listaAvaliacaoDiaria[25] = 2;
	listaAvaliacaoDiaria[26] = 2;
	listaAvaliacaoDiaria[27] = 2;
	listaAvaliacaoDiaria[28] = 2;
	listaAvaliacaoDiaria[29] = 2;
	}
	
	public int[] exibirAvaliacaoDiaria() {
			this.listaAvaliacaoDiaria;
		for (int i = 0; i < listaAvaliacaoDiaria.length; ++i) {
			System.out.println(listaAvaliacaoDiaria[i]);
			
		}
	}
		

}
