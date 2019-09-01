// Figura 3.8: Account.java
// Classe Account com uma variável de instância balance do tipo double e um construtor
// e método deposit que executa a validação

public class Account
{
	private String accountName;// variavel de instancia
	private double accountBalance;//variavel de instancia


	//construtor recebe dois parametros
	public Account(String name, double balance)//nome do construtor é o nome da classe
	{
		accountName = name;
		accountBalance = balance;//o atribiu a variavel de instancia balance
	}


	//medoto para definir o nome no objeto 
	public void setName(String name)//esta linha é o cabeçalho do método
	{
		accountName = name; //amazena o nome
	}

	//metodo para recuperar o nome do objeto
	public String getName()
	{
		return accountName; //retorna valor do nome para o chamador
	}

	public void setBalance(double balance)
	{
		accountBalance = balance;
	}

	//metodo retorna o saldo da conta
	public double getBalance()
	{
		return accountBalance;
	}

	// metodo que deposita (adiciona) apenas uma quantia valida no saldo
	public void deposit (double depositAmount)
	{
		if (depositAmount > 0.0) // se depositAmount for valido
		accountBalance = accountBalance + depositAmount; //adiciona o saldo
	}
    
    //metodo que retira quantia valida da conta ex3.11
	public void withdraw (double withdrawAmount)
	{
		if(withdrawAmount <= accountBalance)
			accountBalance = accountBalance - withdrawAmount;
	}

	public void displayAccount()
	{
		System.out.printf("%s balance: $%.2f %n",getName(), getBalance());
	}
}//fim da classe Account
