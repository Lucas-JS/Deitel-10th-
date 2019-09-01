// figura 7.13: PassArray.java
// passando arrays e elementos do arrays individuais aos metodos

public class PassaVetor{
	// main cria array e chama modifyArray e modifyElement
	public static void main(String[] args) {
		int[] vetor = { 1, 2, 3, 4, 5};

		System.out.printf(
			"Efeito de se passar referencia ao vetor inteiro:%n" + 
			"Os valores do vetor original são:%n");

		// gera saida de elementos do vetor original
		for (int valor : vetor){
			System.out.printf("  %d", valor);
		}

		modificaVetor(vetor); // passa a refencia do vetor
		System.out.printf("%n%nOs valores do vetor modificado são:%n");

		// gera saida de elementos do vetor modificado
		for (int valor : vetor){
			System.out.printf("  %d", valor);
		}

		System.out.printf(
			"%n%nEfeitos de se passar valor do elemento do vetor:%n" + 
			"vetor[3] antes modificaElemento: %d%n", vetor[3]);

		modificaElemento(vetor[3]); // tenta modificar o vetor[3]
		System.out.printf(
			"vetor[3] depois de modificaElemento: %d%n", vetor[3]);
	}
	// multiplica cada elemento de um vetor por 2
	public static void modificaVetor(int[] vetor2){

		for (int contador = 0; contador < vetor2.length; contador++)
			vetor2[contador] *= 2;
	}

	// multiplica argumento por 2
	public static void modificaElemento(int elemento){
		elemento *= 2;
		System.out.printf(
			"Valor do elemento em modificaElemento: %d%n", elemento);
	}
} // fim da classe PassaVetor