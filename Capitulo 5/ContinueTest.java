// figura 5.14: ContinueTest.java
// instrucao continue que termina uma iteracao de uma instrucao for
public class ContinueTest{

	public static void main(String[] args){
		int contador; // variavel de controle tambem utilizada depois que o loop termina

		for (contador = 1; contador <= 10; contador++){
			if(contador == 5){
				continue; // pula o codigo restante no corpo do loop se a contagem for 5
			}
			System.out.printf("%d ", contador);	
		}

		System.out.printf("%nContinue usado para pular a impressao de = 5%n");
	}
} // fim da classe ContinueTest