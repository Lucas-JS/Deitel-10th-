// figura 7.11: DeckOfCardsTest.java
// embaralhando e distribuindo cartas.

public class BaralhoDeCartasTeste{
	// executa o aplicativo 
	public static void main(String[] args){
		BaralhoDeCartas meuBaralhoDeCartas = new BaralhoDeCartas();
		meuBaralhoDeCartas.embaralha(); // coloca Cartas em ordem aleatoria

		// imprime todas as 52 cartas na ordem em que elas são distribuidas
		for (int i = 1; i <= 52; i++){
			// distribui e exibe uma Carta
			System.out.printf("%-19s", meuBaralhoDeCartas.distribuiCarta());

			if (i % 4 == 0) // gera uma nova linha apos cada quarta carta
				System.out.println();
		}
	}
} // fim da classe BaralhoDeCartasTeste