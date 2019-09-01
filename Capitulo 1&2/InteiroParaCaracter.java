// ex 2.29 obtem o valor inteiro de um caractere
import java.util.Scanner;

public class InteiroParaCaracter
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);

		char valor;

		System.out.println("Digite o caractere: ");
		valor = input.nextLine().charAt(0);

		System.out.println("Valor do caracter é: "+ ((int)'valor'));
	}
}