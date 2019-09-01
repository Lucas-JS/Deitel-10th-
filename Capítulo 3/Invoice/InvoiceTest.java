// Figura 3.12: InvoiceTest.Java
// Entrada e saída de números de ponto flutuante com objetos Account
import java.util.Scanner;

public class InvoiceTest
{
	public static void main (String[] args)
	{
	    Invoice invoice = new Invoice(" ", " ", 0 ,0.0);

		//cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		String item;
		String descricao;
		int quantidade;
		double preco;
		
		System.out.print("Digite o número da nota: ");//prompt
		item = input.nextLine(); //obtém a entrada do usuario
		invoice.setNumeroNota(item);

		System.out.print("Escreva a descrição do item: ");//prompt
		descricao = input.nextLine(); //obtém a entrada do usuario
		invoice.setDescricaoItem(descricao);
		

		System.out.print("Digite a quantidade: ");//prompt
		quantidade = input.nextInt(); //obtém a entrada do usuario
		if (quantidade > 0)
			invoice.setQuantidadeComprada(quantidade);

		System.out.print("Digite o preço por item: ");//prompt
		preco = input.nextDouble(); //obtém a entrada do usuario
		if(preco >0)
		invoice.setPrecoPorItem(preco);

		System.out.println("====================================================");
		System.out.println("==================== Nota fiscal ===================");
		System.out.println("====================================================");
		System.out.println("                                                    ");
		System.out.printf("                 Número %s                 %n", invoice.getNumeroNota());
		System.out.printf("                 Item: %s                  %n", invoice.getDescricaoItem());
		System.out.printf("                 Quantidade: %d                 %n", invoice.getQuantidadeComprada());
		System.out.printf("                 Valor do item: %s                  %n", invoice.getPrecoPorItem());
		System.out.printf("                 Valor total: R$%.2f                  %n", invoice.getInvoiceAmount());
		System.out.println("                                                    ");
		System.out.println("====================================================");
		System.out.println("==================== Nota fiscal ===================");
		System.out.println("====================================================");


		
	}//fim da classe main
}//fim da classe InvoiceTest
