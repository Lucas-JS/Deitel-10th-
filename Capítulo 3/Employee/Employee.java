// exercicio 3.13: Employee.java

public class Employee
{
	private String nomeFuncionario;// variaveel de instancia
	private String sobrenomeFuncionario;// variavel de instancia
	private double salarioMensalFuncionario;// variavel de instancia
    
    //construtor recebe tres parametros
	public Employee(String nome, String sobrenome, double salarioMensal){
		this.nomeFuncionario = nome;
		this.sobrenomeFuncionario = sobrenome;
		this.salarioMensalFuncionario = salarioMensal;
	}

	public void setNomeFuncionario(String nome){
		this.nomeFuncionario = nome;
	}

	public String getNomeFuncionario(){
		return nomeFuncionario;
	}

	public void setSobrenomeFuncionario(String sobrenome){
		this.sobrenomeFuncionario = sobrenome;
	}

	public String getSobrenomeFuncionario(){
		return sobrenomeFuncionario;
	}

	public void setSalarioMensalFuncionario(double salarioMensal){
		this.salarioMensalFuncionario = salarioMensal;
	}

	public double getSalarioMensalFuncionario(){
		return salarioMensalFuncionario;
	}

	public double salarioAnual(){
		double salarioAnual;
		salarioAnual = salarioMensalFuncionario * 12;
		return salarioAnual;
	}

	public double aumentoSalarioAnual(){
		double aumentoSalarioAnual;
		aumentoSalarioAnual = salarioAnual() + (salarioAnual() * 0.1);
		return aumentoSalarioAnual;
	}

	public void displaySalarioAnual(){
		System.out.printf("Salario anual de %s %s é de: $%.2f%n", nomeFuncionario,
		 sobrenomeFuncionario, salarioAnual());
	}

	public void displayAumentoSalarioAnual(){
		System.out.printf("%s %s = $%.2f%n", nomeFuncionario, sobrenomeFuncionario, aumentoSalarioAnual());
	}


}