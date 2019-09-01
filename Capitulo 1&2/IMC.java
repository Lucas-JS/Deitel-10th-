//ex 2.33 calculadora de indice de massa corporal
import java.util.Scanner;

public class IMC
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);

		double peso;
		double altura;
		double imc;

		System.out.println("Digite a sua altura:  (ex 1,60)");
		altura = input.nextDouble();

		System.out.println("Digite o seu peso em kilos: ");
		peso  = input.nextDouble();

		imc = peso / (Math.pow(altura,2));					

		System.out.println("                                                 ");

 
		System.out.println("Seu IMC é: "+imc);
		System.out.println("                                                 ");

		if (imc < 18.5){
			System.out.println("Voce está abaixo do peso ideal!");
		}else
		if (imc >=18.5 && imc <=24.9){
			System.out.println("Voce esta dentro do peso ideal! ");
		}else
		if (imc >=25 && imc <= 29.9){
		System.out.println("Voce esta acima do peso ideal! ");
	    }else
	    System.out.println("Voce esta obeso(a), procure um medico!");

	    System.out.println("                                                 ");

		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("                                                 ");

		System.out.println("                  TABELA IMC");
		System.out.println("                                                 ");

		System.out.println("     	Abaixo do peso: IMC menor que 18.5");
		System.out.println("                                                 ");

		System.out.println("           Normal: IMC entre 18.5 e 24.9");
		System.out.println("                                                 ");

		System.out.println("        Acima do peso: IMC entre 25 e 29.9");
		System.out.println("                                                 ");

		System.out.println("              obeso: IMC acima de 30");
		System.out.println("                                                 ");

        System.out.println("                                                 ");
		System.out.println("=================================================");
		System.out.println("=================================================");

	
	}
}