// figura 7.12: EnhancedForTest.java
// utilizando a instrucao for aprimorada para somar inteiros em um array

public class ForAprimoradoTeste{
	public static void main(String[] args) {
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;

		for (int numero : array){
			total += numero;
		}

		System.out.printf("Soma dos elementos do array: %d%n", total);
	}
}