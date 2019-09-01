// Figura 3.8: Account.java
// Classe Account com uma variável de instância balance do tipo double e um construtor
// e método deposit que executa a validação

public class Account
{
	private String name;// variavel de instancia
	private double balance;//variavel de instancia

	//construtor recebe dois parametros
	public Account(String name, double balance)//nome do construtor é o nome da classe
	{
		this.name = name;

		//valida que o balance é maior que 0.0; se nao for,
		// a variavel de instancia balance mantem seu valor inicial padrao de 0.0
		if (balance > 0.0)// se o saldo for valido
		   this.balance = balance;//o atribiu a variavel de instancia balance
	}

	// metodo que deposita (adiciona) apenas uma quantia valida no saldo
	public void deposit (double depositAmount)
	{
		if (depositAmount > 0.0) // se depositAmount for valido
		balance = balance + depositAmount; //adiciona o saldo
	}

	//metodo retorna o saldo da conta
	public double getBalance()
	{
		return balance;
	}

	//medoto para definir o nome no objeto 
	public void setName(String name)//esta linha é o cabeçalho do método
	{
		this.name = name; //amazena o nome
	}

	//metodo para recuperar o nome do objeto
	public String getName()
	{
		return name; //retorna calor do nome para o chamador
	}
}//fim da classe Account
