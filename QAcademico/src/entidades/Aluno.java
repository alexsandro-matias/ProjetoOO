package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa
{
	Date diaLetivo = null;
	NotaDeProva notaAluno;
	
	Calendar calendario = Calendar.getInstance();
	int dia = calendario.get(Calendar.DAY_OF_MONTH);
	
	Map<Integer, Integer> historicoDeAvaliacoes;
	
//	public Aluno()
//	{
//		historicoDeAvaliacoes = new HashMap<Date, Integer>();
//	}

	public Aluno()
	{
		historicoDeAvaliacoes = new HashMap<Integer, Integer>();
	}

	
	public Map<Integer, Integer> avaliarDia(int dia, int nota) {
		historicoDeAvaliacoes.put(dia, nota);
		return historicoDeAvaliacoes;
	}
	
	public void mostrarRelatorio() {
		for (int i = 0; i < historicoDeAvaliacoes.size(); ++i) {
			int dia = historicoDeAvaliacoes.hashCode();
			System.out.println(historicoDeAvaliacoes.get(dia));	
		}
	}
	
		

}
