package entidades;

public class Funcionario extends Pessoa implements Assalariado
{
	private double salario;

	 public double receberSalario(double salario)
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

	@Override
	public double receberSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
