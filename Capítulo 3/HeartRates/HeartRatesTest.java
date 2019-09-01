//ex 3.16 class HeartRatesTest.java
import java.util.Scanner;

public class HeartRatesTest
{
	public static void main(String[] args) 
	{
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;

		HeartRates paciente = new HeartRates(" "," ", 0, 0, 0);

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro nome: \n");
		nome = input.next();
		paciente.setNome(nome);

		System.out.print("Digite o sobrenome: \n");
		sobrenome = input.next();
		paciente.setSobrenome(sobrenome);

		System.out.println("Digite o dia de nascimento: ");
		dia = input.nextInt();
		paciente.setDia(dia);


		System.out.println("Digite o mes de nascimento: ");
		mes = input.nextInt();
		paciente.setMes(mes);

		System.out.println("Digite o ano de nascimento: ");
		ano = input.nextInt();
		paciente.setAno(ano);

		paciente.displayPaciente();

		
	}
}