// figura 4.8: ClassAverage.java
// resolvendo o problema da media da classe usando a repetição controlada por contador.
import java.util.Scanner; //programa utiliza a classe Scanner

public class ClassAverage
{
	public static void main(String[] args) 
	{
		//cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner (System.in);

		//fase de inicialização
		int total = 0; //inicializa a soma das notas inseridas pelo usuario
		int gradeCounter = 0; // inicializa numero de notas inseridas até agora

		// fase de processamento utiliza repetição controlada por contador
		//solicita entrada e le a nota do usuario
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();

		//faz um loop até ler o valor de sentinela inserido pelo usuario
		while (grade != -1) //faz o loop 10 vezes
		{
			total = total + grade; // adiciona grade a total
			gradeCounter = gradeCounter + 1; //incrementa o contador por 1

			//solicita entrada e le a proxima nota fornecida pelo usuario
			System.out.print("Enter grade or -1 to quit: "); //prompt
			grade = input.nextInt(); // insere a proxima nota	
		}

		// fase de termino
		// se usuario inseriu pelo menos uma nota...
		if (gradeCounter != 0)
		{
			//usa numero com ponto decimal para calcular media das notas
			double average = (double)total / gradeCounter;

			//exibe o total e a media (com dois digitos de precisao)
			System.out.printf("%nTotal of the %d grades entered is %d%n",
				gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		}
		else //nenhuma nota doi inserida, assim gera a saida da mensagem apropriada
		   System.out.println("No grades were entered");
	}
}// fim da classe ClassAverage