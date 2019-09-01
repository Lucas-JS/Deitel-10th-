// figura 6.8: Craps.java
// a classe Craps simula o jogo de dados craps
import java.security.SecureRandom;

public class Craps{
	// cria um gerador seguro de numeros aleatorios para uso no metodo rollDice
	private static final SecureRandom numerosAleatorios = new SecureRandom();

	// tipo enum com constantes que representam o estado do jogo
	private enum Status { CONTINUE, WON, LOST};

	// constantes que representam lancamentos comuns dos dados
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_ELEVEN = 11;
	private static final int BOX_CARS = 12;

	// joga uma partida de craps
	public static void main(String[] args) {
		int myPoint = 0; // pontos se não ganhar ou perder na 1a rolagem
		Status gameStatus; // pode conter CONTINUE, WON ou LOST

		int sumOfDice = rollDice(); // primeira rolagem dos dados

		// determina o estado do jogo e a pontuação no primeiro lançamento
		switch (sumOfDice){
			case SEVEN: // ganha com 7 no primeiro lancamento
			case YO_ELEVEN: // ganha com 11 no primeiro lancamento
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES: // perde com 2 no primeiro lancamento
			case TREY: // perde com 3 no primeiro lancamento
			case BOX_CARS: // perde com 12 no primeiro lancamento
				gameStatus = Status.LOST;
				break;
			default: // nao ganhou nem perder, portanto registra a pontuacao
				gameStatus = Status.CONTINUE; // jogo nao terminou
				myPoint = sumOfDice; // informa a pontuacao
				System.out.printf("Pontuação é %d%n", myPoint);
				break;		
		}

		// enquanto o jogo nao estiver completo
		while (gameStatus == Status.CONTINUE) // nem WON nem LOST
		{
			sumOfDice = rollDice(); // lanca os dados novamente

			// determina o estado do jogo
			if (sumOfDice == myPoint) // vitoria por pontuacao
				gameStatus = Status.WON;
			else
				if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuacao
					gameStatus = Status.LOST;	
		}

		// exibe a mensagem ganhou ou perdeu
		if (gameStatus == Status.WON)
			System.out.println("Jogador venceu!");
		else
			System.out.println("Jogador Perdeu!");
	}

	// lanca os dados, calcula a soma e exibe os resultados
	public static int rollDice(){
		// seleciona valores aleatorios do dado
		int die1 = 1 + numerosAleatorios.nextInt(6); // primeiro lancamento do dado
		int die2 = 1 + numerosAleatorios.nextInt(6); // segundo lancamento do dado

		int sum = die1 + die2; // soma dos valores dos dados

		// exibe os resultados desse lancamento 
		System.out.printf("Jogador rolou %d + %d = %d%n", die1, die2, sum);

		return sum;
	}
} // fim da classe Craps