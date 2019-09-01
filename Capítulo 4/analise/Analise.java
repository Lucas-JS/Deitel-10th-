// Figura 4.12: Analysis.java
// Análise dos resultados do exame utilizando instruções de controle aninhadas.
import java.util.Scanner;

public class Analise{

	public static void main (String [] args){
		Scanner entrada = new Scanner(System.in);

		int aprovados = 0;
		int reprovados = 0;
		int contador = 1;

		while (contador <= 10){
			System.out.println("Insira o resultado (1=passou, 2=falhou): ");
			int resultado = entrada.nextInt();

			if (resultado == 1){
				aprovados++;
			}else{
				reprovados++;
			}
			
			contador++;
		}
		System.out.println("numero de aprovados : "+aprovados);
		System.out.println("numero de reprovados : "+reprovados);

		if (aprovados >= 8){
			System.out.println("Bonus para o instrutor!");
		}
	}
}