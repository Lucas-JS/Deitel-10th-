import java.util.Scanner;
public class Media 
{
	public static void main (String [] args){
		/* scanner para obter entrada a partir da janela */
		Scanner entrada = new Scanner(System.in);
		/* fase de inicializacao */
		int total = 0; /* inicializa a soma das notas inseridas */
		int contador = 1; /* inicializa o numero da nota a ser inserida*/

		/* fase de processamento utiliza repeticao controlada por contador */
		while(contador <=10){
			System.out.println("Insira a proxima nota: "); /* prompt */
			int nota = entrada.nextInt(); /* insere a proxima nota */
			total = total + nota; /* adiciona a nota ao total*/
			contador = contador +1; /* incrementa o contador em 1*/
		}

		/* fase final do procesamento */
		int media = total / 10; /* efetua o calculo da media*/

		/* fase de impressao dos resultados */
		System.out.printf("%no total das notas inseridas é : %d%n", total); /*imprime o total calculado */
		System.out.printf("A media é : %d%n", media); /* imprime a media calculada */
	}
}/* fim da classe Media (<-- sonho de comunista detected kkk) */