// figura 4.8: ClassAverage.java
// resolvendo o problema da media da turma usando a repetição controlada por contador.
import java.util.Scanner; //programa utiliza a classe Scanner

public class TurmaMedia
{
	public static void main(String[] args) 
	{
		//cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner (System.in);

		//fase de inicialização
		int total = 0; //inicializa a soma das notas inseridas pelo usuario
		int contaNota = 0; // inicializa numero de notas inseridas até agora

		// fase de processamento utiliza repetição controlada por contador
		//solicita entrada e le a nota do usuario
		System.out.print("Insira a nota ou -1 para encerrar: ");
		int nota = input.nextInt();

		//faz um loop até ler o valor de sentinela inserido pelo usuario
		while (nota != -1) //faz o loop 10 vezes
		{
			total = total + nota; // adiciona nota a total
			contaNota = contaNota + 1; //incrementa o contador por 1

			//solicita entrada e le a proxima nota fornecida pelo usuario
			System.out.print("Insira a nota ou -1 para encerrar: "); //prompt
			nota = input.nextInt(); // insere a proxima nota	
		}

		// fase de termino
		// se usuario inseriu pelo menos uma nota...
		if (contaNota != 0)
		{
			//usa numero com ponto decimal para calcular media das notas
			double media = (double)total / contaNota;

			//exibe o total e a media (com dois digitos de precisao)
			System.out.printf("%nO total das %d notas inseridas é %d%n",
				contaNota, total);
			System.out.printf("A media da turma é %.2f%n", media);
		}
		else //nenhuma nota foi inserida, assim gera a saida da mensagem apropriada
		   System.out.println("Nenhuma nota foi inserida");
	}
}// fim da classe TurmaMedia