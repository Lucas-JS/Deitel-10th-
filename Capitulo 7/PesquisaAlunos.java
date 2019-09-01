// 7.8: StudentPoll.java
// programa de analise de enquete

public class PesquisaAlunos{
	public static void main(String[] args) {
		// array das respostas dos alunos (mais tipicamente, inserido em tempo de execucao)
		int[]  respostas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

		int[] frequencia = new int[6]; // array de contadores de frequencia

		// para cada resposta, seleciona elemento de respostas e utiliza esse valor
		// como indice de frequencia para determinar elemento a incrementar
		for (int resposta = 0; resposta < respostas.length; resposta++){
			try{
				++frequencia[respostas[resposta]];
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e); // invoca o metodo toString
				System.out.printf(" respostas[%d] = %d%n%n", resposta, respostas[resposta]);
			}
		}

		System.out.printf("%s%11s%n", "Classificação", "Frequencia");

		// gera saida do valor de cada elemento do array
		for (int classificacao = 1; classificacao < frequencia.length; classificacao++){
			System.out.printf("%13d%11d%n", classificacao, frequencia[classificacao]);
		} 
	}
} // fim da classe PesquisaAlunos