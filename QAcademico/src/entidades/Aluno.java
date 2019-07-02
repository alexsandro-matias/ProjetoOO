package entidades;

import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa
{
	// Date diaLetivo = null;
	NotaDeProva notaAluno;
	//
	// Calendar calendario = Calendar.getInstance();
	// int dia = calendario.get(Calendar.DAY_OF_MONTH);
	HashMap<Integer, Integer> historicoDeAvaliacoes;

	// public Aluno()
	// {
	// historicoDeAvaliacoes = new HashMap<Date, Integer>();
	// }
	public Aluno()
	{
		historicoDeAvaliacoes = new HashMap<Integer, Integer>();
	}

	public HashMap<Integer, Integer> avaliarDia(int dia, int nota)
	{
		historicoDeAvaliacoes.put(dia, nota);
		return historicoDeAvaliacoes;
	}

	public void mostrarRelatorio()
	{
		for (Map.Entry<Integer, Integer> mostrarRelatorio : historicoDeAvaliacoes.entrySet())
		{
			System.out.println();
			System.out.print(mostrarRelatorio.getKey() + " - ");
			System.out.println(mostrarRelatorio.getValue());
		}
	}
}
