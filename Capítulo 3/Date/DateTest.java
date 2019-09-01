//ex 3.14 classe DateTest

import java.util.Scanner;

public class DateTest
{
	public static void main(String[] args) 
	{
		int dia;
		int mes;
		int ano;

		Date date = new Date(0, 0, 0);

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o dia: ");
		dia = input.nextInt();
		date.setDia(dia);


		System.out.println("Digite o mes: ");
		mes = input.nextInt();
		date.setMes(mes);

		System.out.println("Digite o ano: ");
		ano = input.nextInt();
		date.setAno(ano);

		

		date.displayDate();

	}
}