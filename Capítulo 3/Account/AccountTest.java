// Figura 3.9: AccountTest.Java
// Entrada e saída de números de ponto flutuante com objetos Account
import java.util.Scanner;

public class AccountTest
{
	public static void main (String[] args)
	{
		String name;
		double balance;
		double depositAmount;

	    Account account1 = new Account(" ", 0.0);
	    Account account2 = new Account(" ", 0.0);


		//cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome para account1: \n");
		name = input.next();
		account1.setName(name);

		System.out.print("Digite o saldo inicial para account1: \n");
		balance = input.nextDouble();
		if (balance > 0.0)
            account1.setBalance(balance);

		System.out.print("Digite o nome para account2: \n");
		name = input.next();
		account2.setName(name);

		System.out.print("Digite o saldo inicial para account2: \n");
		balance = input.nextDouble();
		if (balance > 0.0)
		account2.setBalance(balance);

	    //exibe saldo inicial de cada objeto
	    account1.displayAccount();
	    account2.displayAccount();


		System.out.print("Enter deposit amount for account1: \n");//prompt
		depositAmount = input.nextDouble(); //obtém a entrada do usuario
		System.out.printf("%nadding %.2f to account1 balance%n%n",
			depositAmount);
		account1.deposit(depositAmount);// adiciona o saldo de account1

		//exibe saldos
		account1.displayAccount();
	    account2.displayAccount();

		System.out.print("Enter the deposit amount for account2: \n"); //prompt
		depositAmount = input.nextDouble(); //obtem a entrada do usuario
		System.out.printf("%nadding %.2f to account2 balance%n%n" ,
			depositAmount);
		account2.deposit(depositAmount); //adiciona o saldo de account2

		//exibe os saldos
		account1.displayAccount();
	    account2.displayAccount();

		System.out.print("Enter the withdraw amount account1: \n");
		double withdrawAmount = input.nextDouble();

		if(account1.getBalance() < withdrawAmount){
			System.out.println("Withdrawal amount exceeded account balance");
		}else
        System.out.printf("Subtracting %.2f of account1%n", withdrawAmount);
        account1.withdraw(withdrawAmount);

        //exibe os saldos
		account1.displayAccount();
	    account2.displayAccount();
        
        System.out.print("Enter the withdraw amount account2: \n");
		withdrawAmount = input.nextDouble();

		if(account2.getBalance() < withdrawAmount){
			System.out.println("Withdrawal amount exceeded account balance");
		}else
		System.out.printf("Subtracting %.2f of account2%n", withdrawAmount);
        account2.withdraw(withdrawAmount);

         //exibe os saldos
		account1.displayAccount();
	    account2.displayAccount();

	}//fim da classe main
}//fim da classe AccountTest
