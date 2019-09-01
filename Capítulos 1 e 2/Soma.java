// figura 2.7: Soma.java
//modificado para uso de GUI conforme desafio no capitulo 3
// Programa de adição que insere dois números, então exibe a soma deles.
import javax.swing.JOptionPane;

public class Soma
{
   //método main inicia a execução do aplicativo java
   public static void main (String[] args)
   {
   /* //cria um Scanner para obter entrada a partir da janela de comando
   Scanner input = new Scanner(System.in);
   
   int num1; //variavel para armazenar o primeiro numero a ser somado
   int num2; // variavel para armazenar o segundo numero a ser somado
   int soma; //soma num1 e num2 
 
   System.out.print("Digite o primeiro inteiro: "); //prompt
   num1 = input.nextInt(); //le o primeiro numero fornecido pelo usuario

   System.out.print("Digite o segundo inteiro: ");//prompt 
   num2 = input.nextInt();//le o segundo numero fornecido pelo usuario

   soma = num1 + num2;//soma os numeros, depoisarmazena o total em soma

   System.out.printf("Soma é %d%n",soma);//exibe a soma*/

   String num1 = JOptionPane.showInputDialog("digite o primeiro inteiro: ");
   String num2 = JOptionPane.showInputDialog("digite o segundo inteiro: ");

  int soma = Integer.parseInt(num1) + Integer.parseInt(num2); // converte o numeros de string para int e efetua a operacao

  String message = 
       String.format("Resultado = %d%n", soma); // mensagem formatada concatenando o tipo de dado a ser exibido

  JOptionPane.showMessageDialog(null, message);
  

  }//fim do metodo main
}//fim da classe Soma
