//exercicio 2.6 Produto.java
//programa para calculo de produto de tres inteiros
import java.util.Scanner;//programa utiliza Scanner

public class Produto
{

 public static void main (String[] args)
 {
  //cria Scanner para obter entrada a partir da janela de comando
  Scanner input = new Scanner(System.in);

  int x;//primeiro numero inserido pelo usuario
  int y;//segundo numero inserido pelo usuario
  int z;//terceiro numero inserido pelo usuario
  int resultado;//produto dos numeros

   System.out.println("Digite o primeiro inteiro: ");//solicita entrada
   x = input.nextInt();//le o primeiro inteiro

   System.out.println("Digite o segundo inteiro: ");//solicita entrada
   y = input.nextInt();//le o segundo inteiro

   System.out.println("Digite o terceiro inteiro: ");//solicita entrada
   z = input.nextInt();//le o terceiro inteiro

 resultado = x * y * z ;// calcula o produto dos numeros

    System.out.printf("Produto é: %d%n", resultado);

  }//fim do metodo main

}//fim da classe Produto
