// figura 7.17: InitArray.java
// inicializando vetores bidimensionais

public class VetorBi{
	// cria e gera saida de vetores bidimensionais
	public static void main(String[] args){
		int[][] vetor1 = {{1, 2, 3}, { 4, 5, 6}};
		int[][] vetor2 = {{1, 2}, {3}, {4, 5, 6}};

		System.out.println("Valores em cada linha do vetor1 são");
		saidaVetor(vetor1); // exibe vetor1 por linha

		System.out.printf("%nValores no vetor2 por linha são%n");
		saidaVetor(vetor2); // exibe vetor2 por linha
	}

	// gera saida de linhas e colunas de um vetor bidimensional
	public static void saidaVetor(int[][] vetor){
		// faz um loop pelas linhas do vetor
		for (int linha = 0; linha < vetor.length; linha++){
			// faz loop pelas colunas da linha atual
			for (int coluna = 0; coluna < vetor[linha].length; coluna++){
				System.out.printf("%d ", vetor[linha][coluna]);
			}
			System.out.println();
		}
	}
} // fim da classe VetorBi