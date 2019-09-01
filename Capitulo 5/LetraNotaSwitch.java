// Figura 5.9: LetterGrades.java
// A classe LetterGrades utiliza a intrucao switch para contar as letras dad notas escolares
import java.util.Scanner;

public class LetraNotaSwitch{

	public static void main(String[] args) {
		int total = 0;  // soma das notas 
		int contaNotas = 0; // numero de notas inseridas 
		int contaA = 0; // contagem de notas A
		int contaB = 0; // contagem de notas B
		int contaC = 0; // contagem de notas C
		int contaD = 0; // contagem de notas D
		int contaE = 0; // contagem de notas E
		int contaF = 0; // contagem de notas F

		Scanner entrada = new Scanner(System.in);

		System.out.printf("%s%n%s%n %s%n %s%n",
			"Digite as notas inteiras entre 0-100.",
			"Tecle o indicador de fim arquivo para encerrar a inserção:",
			"No Linux/Unix/Mac OS tecle <Ctrl>+d então pressione Enter",
			"No Windows tecle <Ctrl>+z então pressione Enter");

		// faz loop até o usuário inserir o indicador de fim de arquivo
		while(entrada.hasNext()){
			int nota = entrada.nextInt(); // le a nota 
			total += nota; // adiciona nota a total
			contaNotas++; // incrementa o numero de notas

			// incrementa o contador de letras adequado
			switch (nota / 10){
				case 9: // a nota estava entre 90
				case 10: // e 100, inclusive
					contaA++;
					break; // sai do switch

				case 8: // nota estava entre 80 e 89
					contaB++;
					break;

				case 7: // nota estaca entre 70 e 79
					contaC++;
					break;

				case 6: // nota estava entre 60 e 69
					contaD++;
					break;

				default: // nota era menor que 60
					contaF++;
					break; // opcional, fecha switch de qualquer maneira				
			} // fim do switch
		} // fim do while

		// exibe o relatorio de notas
		System.out.printf("%nRelatorio de notas:%n");

		// se o usuario inseriu pelo menos uma nota 
		if(contaNotas !=0){
			//calcula a media de todas as notas inseridas
			double media = (double) total / contaNotas;

			// gera a saida de resumo de resultados
			System.out.printf("O total das %d notas inseridas é %d%n", contaNotas, total);
			System.out.printf("A media da turma é %.2f%n", media);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
				"Numero de estudantes que receberam cada nota:",
					"A: ",contaA,// exibe numero de notas A
					"B: ",contaB,// exibe numero de notas B
					"C: ",contaC,// exibe numero de notas C
					"D: ",contaD,// exibe numero de notas D
					"F: ",contaF);// exibe numero de notas F

		}// fim do if
		else // nenhuma nota foi inserida, assim gera a saida da mensagem apropriada
			System.out.println("Nenhuma nota foi inserida");
	}// fim de main
} // finaliza a clasLetraNotaSwitch