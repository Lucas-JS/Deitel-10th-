//figura 2.15 
//Compara inteiros utilizando expressoes if, operadores relacionais 
// e operadores de igualdade
import java.util.Scanner;// programa utiliza classe Scanner

public class Comparacao
{
  //metodo main inicia a execucao do aplicativo java
  public static void main (String[] args)
  {
    //cria Scanner para obter entrada a partit da linha de comando
    Scanner input = new Scanner(System.in);
   
    int num1;//primeiro numero a comparar 
    int num2;//segundo numero a comparar

    System.out.print("Digite o primeiro inteiro: ");//prompt
    num1 = input.nextInt();//le o primeiro numero fornecido pelo usuario

    System.out.print("Digite o segundo inteiro: ");//prompt
    num2 = input.nextInt();//le o segundo numero fornecido pelo usuario

    if (num1 == num2)
       System.out.printf("%d == %d%n", num1, num2);

    if (num1 != num2)
       System.out.printf("%d != %d%n", num1, num2);

    if (num1 < num2)
       System.out.printf("%d < %d%n", num1, num2);
    
    if (num1 > num2)
       System.out.printf("%d > %d%n", num1, num2);

    if (num1 <= num2)
       System.out.printf("%d <= %d%n", num1, num2);
   
    if (num1 >= num2)
       System.out.printf("%d >= %d%n", num1, num2);
 
  }//fim do metodo main
}//fim da classe Comparacao
