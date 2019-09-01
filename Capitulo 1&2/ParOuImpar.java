//ex 2.25
import java.util.Scanner;

public class ParOuImpar
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int numero;

		System.out.println("Digite o numero: ");
		numero = input.nextInt();

		if (numero % 2 == 0){
			System.out.println("O numero digitado é par! ");
		}else

		System.out.println("O numero digitado é impar! ");
	}
}