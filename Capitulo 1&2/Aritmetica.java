//ex 2.15 
/**
Escreva um aplicativo que solicite ao usuário inserir dois inteiros,obtenha dele esses números e imprima sua soma, produto,diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.
*/
import java.util.Scanner;

public class Aritmetica
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		int n1, n2;

		int soma;
		int produto;
		int diferenca;
		int quociente;


		System.out.println("Digite o primeiro inteiro:  ");
		n1 = input.nextInt();

		System.out.println("Digite o segundo inteiro: ");
		n2 = input.nextInt();

		soma = n1 + n2;
		produto = n1 * n2;
		diferenca = n1 - n2;
		quociente = n1 / n2;

		System.out.println("Soma = "+soma);

		System.out.println("produto = "+produto);

		System.out.println("diferenca = "+diferenca);

		System.out.println("quociente = "+quociente);
	}
}
