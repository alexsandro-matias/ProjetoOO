package entidades;

public class Funcionario extends Pessoa implements Assalariado
{
	private double salario;

	@Override public double receberSalario(double salario)
	{
		return this.getSalario();
	}

	public double getSalario()
	{
		return salario;
	}

	public void setSalario(double salario)
	{
		this.salario += salario;
	}
	
	
	
}
