// figura 7.7
// programa de jogo de dados utilizando arrays em vez de switch
import java.security.SecureRandom;

public class RollDieArray{
	public static void main(String[] args){
		SecureRandom numerosAleatorios = new SecureRandom();
		int[] frequencia = new int[7]; // array de contadores de frequencia

		// lanca o dado 6M vezes; usa o valor do dado como indice de frequencia
		for (int roll = 1;  roll <= 6000000; roll++){
			++frequencia[1 + numerosAleatorios.nextInt(6)];
		}

		System.out.printf("%s%11s%n", "Face", "Frequencia");

		// gera saida do valor de cada elemento do array
		for (int face = 1; face < frequencia.length; face++){
			System.out.printf("%4d%11d%n", face, frequencia[face]);
		}
	}
} // fim da classe RollDieArray