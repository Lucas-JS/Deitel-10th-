//ex 2.24
import java.util.Scanner;

public class MenorMaiorSimples
{
	public static void main  (String[] args)
	{
		Scanner input = new Scanner(System.in);

		int menor;
		int maior;
		int n1, n2, n3, n4, n5;

		System.out.println("Digite o primeiro inteiro: ");
		n1 = input.nextInt();

		menor = n1;
		maior = n1;

		System.out.println("Digite o segundo inteiro: ");
		n2 = input.nextInt();

		if(n2 > maior)
			maior = n2;

		if (n2 < menor)
			menor = n2;

		System.out.println("Digite o terceiro inteiro: ");
		n3 = input.nextInt();

		if(n3 > maior)
			maior = n3;

		if (n3 < menor)
			menor = n3;

		System.out.println("Digite o quarto inteiro: ");
		n4 = input.nextInt();

		if(n4 > maior)
			maior = n4;

		if (n4 < menor)
			menor = n4;

		System.out.println("Digite o quinto inteiro: ");
		n5 = input.nextInt();

		if(n5 > maior)
			maior = n5;

		if (n5 < menor)
			menor = n5;

		System.out.println("Maior = "+maior);

		System.out.println("Menor = "+menor);



	}
}