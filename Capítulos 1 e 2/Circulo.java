// ex 2.28 
import java.util.Scanner;

public class Circulo
{
	public static void main (String[] args)
	{
		/*double area;
		double circunferencia;
		double diametro;*/
		int raio;

		Scanner input = new Scanner (System.in);

		System.out.println("Digite o raio do circulo: ");
		raio = input.nextInt();

		/*diametro = 2*raio;

		circunferencia = 2 * (Math.PI * raio);

		area = Math.PI * (Math.pow(raio,2));

		System.out.println("Diametro é: "+diametro);

		System.out.println("Circunferencia é: "+circunferencia);

		System.out.println("Area é: "+area);*/

		System.out.printf("%.2f%n Diametro é: ",2 * Integer.floatValue(raio));
		
	}
}