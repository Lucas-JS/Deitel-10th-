// figura 7.2/7.3/7.4: InitArray.java
// inicializando os elementos de um array como valores padrao de zero

public class IniciandoArray{
	public static void main(String[] args) {
		// declara array variavel e o inicializa como um objeto array
		int[] array = new int[10]; // cria o objeto array

		System.out.printf("%s%8s%n","Indice","Valor"); // títulos de coluna

		// gera a saida do valor de cada elemento do array
		for (int contador = 0; contador < array.length; contador++){
			System.out.printf("%6d%8d%n", contador, array[contador]);
		}

		System.out.println(); // pula espaço para o segundo exemplo

		// a lista de inicializador especifica o valor inicial de cada elemento (figura 7.3)
		int[] array2 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

		System.out.printf("%s%8s%n","Indice","Valor"); // títulos de coluna

		// gera a saida do valor de cada elemento do array
		for (int contador = 0; contador < array2.length; contador++){
			System.out.printf("%6d%8d%n", contador, array2[contador]);
		}

		System.out.println(); // pula espaço para o terceiro exemplo

		final int ARRAY_LENGTH = 10; // declara constante
		int[] array3 = new int[ARRAY_LENGTH]; // cria o array

		// calcula o valor de cada elemento do array
		for (int contador = 0; contador < array3.length; contador++){
			array3[contador] = 2 + 2 * contador;	
		}

		System.out.printf("%s%8s%n","Indice","Valor"); // títulos de coluna

		// gera a saida do valor de cada elemento do array
		for (int contador = 0; contador < array3.length; contador++){
			System.out.printf("%6d%8d%n", contador, array3[contador]);
		}

	}
} // fim da classe IniciandoArray