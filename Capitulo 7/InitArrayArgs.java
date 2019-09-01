// figura 7.21: InitArray.java
// inicializando um array com argumentos de linha de comando

public class InitArrayArgs{
	public static void main(String[] args) {
		// verifica numero de argumentos de linha de comando
		if(args.length != 3){
			System.out.printf(
				"Erro: Por favor reinsira o comando, incluindo%n" + 
				"um tamanho de array, valor inicial e incremento.%n");
		}else{
			// obtem o tamanho do array a aprtir do primeiro argumento de linha de comando
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];

			// obtem o valor inicial e o incrementa a partir dos argumentos de linha de comando
			int valorInicial = Integer.parseInt(args[1]);
			int incremento = Integer.parseInt(args[2]);

			// calcula o valor de cada elemento do array
			for (int contador = 0; contador < array.length; contador++){
				array[contador] = valorInicial + incremento * contador;
			}

			System.out.printf("%s%8s%n", "Indice", "Valor");

			// exibe o valor e o indice de array
			for (int contador = 0; contador < array.length; contador++){
				System.out.printf("%5d%8d%n", contador, array[contador]);
			}
		}
	}
} // fim da classe InitArrayArgs