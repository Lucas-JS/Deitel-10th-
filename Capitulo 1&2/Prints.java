/**2.14 Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço. Use as seguintes
técnicas:
a) Uma instrução System.out.println .
b) Quatro instruções System.out.print .
c) Uma instrução System.out.printf .
*/

public class Prints
{

   public static void main (String[] args)
   {

int n1 = 1;

int n2 = 2;

int n3 = 3;

int n4 = 4;

   	System.out.println("Uma instrução println");

    System.out.println("1 2 3 4");

    System.out.println("quatro instruções print");

    System.out.print("1 ");

    System.out.print("2 ");

    System.out.print("3 ");

    System.out.print("4\n");

    System.out.println("Uma instrução printf");

    System.out.printf("%d %d %d %d%n", n1, n2, n3, n4);

   }//fim do metodo main	
}//fim da classe Prints
