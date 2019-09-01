// figura 7.22: ArrayManipulations.java
// metodos da classse Arrays e System.arraycopy
import java.util.Arrays;

public class ManipulacaoVetor{
	public static void main(String[] args) {
		// classifica doubleVetor em ordem crescente

		double[] doubleVetor = { 8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleVetor);
		System.out.printf("%ndoubleVetor: ");

		for (double valor : doubleVetor){
			System.out.printf("%.1f ", valor);
		}

		// preenche o vetor de 10 elementos com 7s
		int[] VetorIntPreenchido = new int[10];
		Arrays.fill(VetorIntPreenchido, 7);
		displayVetor(VetorIntPreenchido, "VetorIntPreenchido");

		// copia vetor intVetor em vetor intVetorCopy
		int[] intVetor = {1, 2, 3, 4, 5, 6};
		int[] intVetorCopy = new int[intVetor.length];
		System.arraycopy(intVetor, 0, intVetorCopy, 0, intVetor.length);
		displayVetor(intVetor,"intVetor");
		displayVetor(intVetorCopy,"intVetorCopy");

		// verifica a igualdade de intVetor r intVetorCopy
		boolean b = Arrays.equals(intVetor, intVetorCopy);
		System.out.printf("%n%nintVetor %s intVetorCopy%n", (b ? "==" : "!="));

		// verifica a igualdade de intVetor e VetorIntPreenchido
		b = Arrays.equals(intVetor, VetorIntPreenchido);
		System.out.printf("intVetor %s VetorIntPreenchido%n", (b ? "==" : "=!"));

		// pesquisa o valor 5 em intVetor
		int location = Arrays.binarySearch(intVetor, 5);

		if(location >= 0){
			System.out.printf(
				"5 encontrado no elemento %d em intVetor%n", location);
		}else{
			System.out.println("5 não encontrado em intVetor");
		}

		// pesquisa o valor 8763 em intVetor
		location = Arrays.binarySearch(intVetor, 8763);

		if (location >= 0){
			System.out.printf(
				"8763 encontrado no elemento %d em intVetor%n", location);
		}else{
			System.out.println("8763 não encontrado em intVetor");
		}
	}

	// gera saida de valores em cada array
	public static void displayVetor(int[] array, String description){
		System.out.printf("%n%s: ", description);

		for (int valor : array){
			System.out.printf("%d ", valor);
		}
	}
} // fim da classe ManipulacaoVetor.java