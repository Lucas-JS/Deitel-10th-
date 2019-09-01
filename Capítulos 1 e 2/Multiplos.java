//ex 2.26
import java.util.Scanner;

public class Multiplos 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);

		int n1, n2;

		System.out.println("Digite o primeiro inteiro: ");
		n1 = input.nextInt();

		System.out.println("Digite o segundo inteiro: ");
		n2 = input.nextInt();

		if (n1 % n2 == 0){
			System.out.println("Os numeros sao multiplos! ");
		}else

		System.out.println("Os numeros nao sao multiplos! ");
		   

		System.out.println("Resultado da multiplicação: "+n1*n2);

	}
}