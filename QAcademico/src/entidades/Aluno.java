package entidades;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa
{
	Date diaLetivo = null;
	NotaDeProva notaAluno;
	
	Map<Date, Integer> historicoDeNotas;
	
	public Aluno()
	{
		historicoDeNotas = new HashMap<Date, Integer>();
	}

}
