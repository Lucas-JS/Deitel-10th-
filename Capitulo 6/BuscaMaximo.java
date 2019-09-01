// Figura 6.3: MaximumFinder.java
// metodo maximum declarado pelo programador com tres parametros double
import java.util.Scanner;

public class BuscaMaximo{
	// obtem tres valores de ponto flutuante e localiza o valor maximo
	public static void main(String[] args) {
		// cria Scanner para entrada a partir da janela de comando
		Scanner entrada = new Scanner(System.in);

		// solicita e insere tres valore de ponto flutuante
		System.out.print(
			"Digite tres valores de ponto flutuante separado por espaços: ");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		double num3 = entrada.nextDouble();

		// determina o valor maximo
		double resultado = maximo(num1, num2, num3);

		// exibe o valor maximo
		System.out.println("Maximo é: " +resultado);
	}

	// retorna o maximo dos seus tres parametros double
	public static double maximo(double x, double y, double z){
		double valorMaximo = x; // supoe que x é o maior valor inicial

		// determina se y é maior que valorMaximo
		if (y > valorMaximo)
			valorMaximo = y;

		//determina se z é maior que valorMaximo
		if (z > valorMaximo)
			valorMaximo = z;

		return valorMaximo;
	}
} // fim da classe BuscaMaximo