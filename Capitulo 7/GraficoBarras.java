// figura 7.6: BarChart.java
// programa de impressao de grafico de barras

public class GraficoBarras{
	public static void main(String[] args) {
		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

		System.out.println("Distribuição de notas: ");

		// para cada elemento de array, gera saida de uma barra de grafico
		for (int contador = 0; contador < array.length; contador++){
			// gera saida do rotulo de barra ("00-09: ", ...,"90-99: ", "100:")
			if (contador == 10){
				System.out.printf("%5d: ", 100);
			}else{
				System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
			}

			// imprime a barra de asteriscos
			for (int estrelas = 0; estrelas < array[contador]; estrelas++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
} // fim da classe GraficoBarras