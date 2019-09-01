// figura 5.13: BreakTest.java
// a instrucao break sai de uma instrucao for
public class BreakTest{

	public static void main(String[] args){
		int contador; // variavel de controle tambem utilizada depois que o loop termina

		for (contador = 1; contador <= 10; contador++){
			if(contador == 5){
				break; // termina o loop se a contagem for 5
			}
			System.out.printf("%d ", contador);	
		}

		System.out.printf("%nQuebra de loop ao atingir = %d%n", contador);
	}
} // fim da classe BreakTest