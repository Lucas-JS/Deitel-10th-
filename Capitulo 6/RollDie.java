// figura 6.7: RollDie.java
// rola um dado de seis lados 6.000.000 vezes.
import java.security.SecureRandom;

public class RollDie{
	public static void main(String[] args) {
		// o objeto numerosAleatorios produzira numeros aleatorios seguros
		SecureRandom numerosAleatorios = new SecureRandom();

		int frequencia1 = 0; // contagem de 1s lançados
		int frequencia2 = 0; // contagem de 2s lançados
		int frequencia3 = 0; // contagem de 3s lançados
		int frequencia4 = 0; // contagem de 4s lançados
		int frequencia5 = 0; // contagem de 5s lançados
		int frequencia6 = 0; // contagem de 6s lançados

		// soma 6.000.000 lançamentos de um dado
		for (int roll = 1; roll <=6000000; roll++){
			int face = 1 + numerosAleatorios.nextInt(6);

			// usa o valor 1-66 para as faces a fim de determinar qual contador incrementar
			switch (face){
				case 1:
					frequencia1++; // incrementa o contador de 1s
					break;
				case 2:
					frequencia2++; // incrementa o contador de 2s
					break;
				case 3:
					frequencia3++; // incrementa o contador de 3s
					break;
				case 4:
					frequencia4++; // incrementa o contador de 4s
					break;
				case 5:
					frequencia5++; // incrementa o contador de 5s
					break;
				case 6:
					frequencia6++; // incrementa o contador de 6s
					break;
			}

		}

		System.out.println("Face\tFrequencia"); // cabeçalhos de saida
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
			frequencia1, frequencia2, frequencia3, frequencia4, frequencia5, frequencia6);

	}
} // fim da classe RollDie