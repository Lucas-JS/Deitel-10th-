// figura 5.6: Interest.java
// calculo de juros compostos com for.
public class Juros {

	public static void main(String[] args){
		double total; // quantia em depósito ao fim de cada ano
		double principal = 1000.0; // quantidade inicial antes dos juros
		double taxa = 0.05; // taxa de juros anual

		// exibe cabecalhos
		System.out.printf("%s%19s %n", "Ano", "Acumulado");

		// calcula quantidade de deposito para cada um dos dez anos
		for (int ano = 1; ano <= 10 ; ++ano) {
			// calcula nova quantidade durante ano especificado
			total = principal * Math.pow(1.0 + taxa, ano);

			//exibe ano e a quantidade
			System.out.printf("%3d%,19.2f%n", ano, total);

		}

	}	
}// fim da classe Juros