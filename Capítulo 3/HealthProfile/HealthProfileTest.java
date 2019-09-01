//ex 3.17 class HealthProfileTest.java
import java.util.Scanner;

public class HealthProfileTest
{
	public static void main(String[] args) 
	{
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;
		double altura;
		double peso;

		HealthProfile paciente = new HealthProfile(" "," ", 0, 0, 0, 0.0, 0);

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

		System.out.println("Digite a sua altura: ");
		altura = input.nextDouble();
		paciente.setAltura(altura);

		System.out.println("Digite o seu peso: ");
		peso = input.nextDouble();
		paciente.setPeso(peso);

		paciente.displayPaciente();

		
	}
}