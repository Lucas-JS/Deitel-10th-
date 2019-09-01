// figura 6.6: RandomIntergers.java
// Inteiros aleatorios deslocados e escalonados
import java.security.SecureRandom; // o programa usa a classe SecureRamdom

public class InteirosAleatorios{
	public static void main(String[] args) {
		// o objeto randomNumbers produzira numeros aleatorios seguros
		SecureRandom randomNumbers = new SecureRandom();

		// faz o loop 20 vezes 
		for (int contador = 1; contador <=20; contador++ ) {
			int face = 1 + randomNumbers.nextInt(6);

			System.out.printf("%d ", face); // exibe o valor gerado

			// se o contador for divisivel por 5, inicia uma nova linha de saida
			if (contador %5 == 0){
				System.out.println();
			}
		}
	}
} // fim da classe InteirosAleatorios