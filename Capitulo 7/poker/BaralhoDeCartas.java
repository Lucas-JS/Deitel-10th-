// figura 7.10: DeckOfCards.java
// classe DeckOfCards  representa um baralho.
import java.security.SecureRandom;

public class BaralhoDeCartas{
	private Carta[] baralho; // array de objetos Carta
	private int cartaAtual; // indice da proxima Carta a ser distribuida (0-51)
	private static final int NUMERO_DE_CARTAS = 52; // numero constante de cartas
	// gerador de numeros aleatorio
	private static final SecureRandom numerosAleatorios = new SecureRandom();

	// construtor preenche baralho de cartas
	public BaralhoDeCartas(){
		String[] faces = { "As", "Dois", "Tres", "Quatro", "Cinco", "Seis",
		"Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei" };

		String[] naipes = { "Copas", "Ouro", "Paus", "Espadas" };

		baralho = new Carta[NUMERO_DE_CARTAS]; // cria array de objetos Carta
		cartaAtual = 0; // a primeira Carta distribuida será o baralho[0]

		// preenche baralho com objetos Carta
		for (int contador = 0; contador < baralho.length; contador++){
			baralho[contador] = new Carta(faces[contador % 13], naipes[contador / 13]);
		}
	}

	// embaralha as cartas com um algoritmo de uma passagem
	public void embaralha(){
		// a proxima chamada para o metodo distribuiCarta deve comecar no baralho[0] e as compara
		for(int primeira = 0; primeira < baralho.length; primeira++){
			// seleciona um numero aleatorio entre 0 e 51
			int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);

			// compara Carta atual com Carta aleatoriamente selecionada
			Carta temp = baralho[primeira];
			baralho[primeira] = baralho[segunda];
			baralho[segunda] = temp;
		}
	}

	// distribui uma Carta
	public Carta distribuiCarta(){
		// determina se ainda ha Cartas a serem distribuidas
		if (cartaAtual < baralho.length){
			return baralho[cartaAtual++]; // retorna Carta atual no array
	    }else{
	    	return null; // retorna nulo para indicar que todas as Cartas foram ditribuidas
	    }
    }
} // fim da classe BaralhoDeCartas