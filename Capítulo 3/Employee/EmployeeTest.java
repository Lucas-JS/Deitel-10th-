//ex 3.13 Classe EmployeeTest

import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String[] args) {

		Employee employee1 = new Employee("nomeFuncionario","sobrenomeFuncionario",0.0);
		Employee employee2 = new Employee("nomeFuncionario","sobrenomeFuncionario",0.0);

		Scanner input = new Scanner(System.in);

		String nomeFuncionario;
		String sobrenomeFuncionario;
		double salarioMensal;

		System.out.println("Digite os detalhes do funcionario 1: \n");

		System.out.print("Digite o nome: ");
		nomeFuncionario = input.next();
		employee1.setNomeFuncionario(nomeFuncionario);
		employee1.getNomeFuncionario();

		System.out.print("Digite o sobrenome: ");
		sobrenomeFuncionario = input.next();
		employee1.setSobrenomeFuncionario(sobrenomeFuncionario);
		employee1.getSobrenomeFuncionario();

		System.out.print("Digite o salario mensal: ");
		salarioMensal = input.nextDouble();
		if(salarioMensal > 0)
			employee1.setSalarioMensalFuncionario(salarioMensal);
		employee1.getSalarioMensalFuncionario();

		System.out.println();

		System.out.println("Digite os detalhes do funcionario 2: \n");

		
		System.out.print("Digite o nome: ");
		nomeFuncionario = input.next();
		employee2.setNomeFuncionario(nomeFuncionario);
		employee2.getNomeFuncionario();

		System.out.print("Digite o sobrenome: ");
		sobrenomeFuncionario = input.next();
		employee2.setSobrenomeFuncionario(sobrenomeFuncionario);
		employee2.getSobrenomeFuncionario();

		System.out.print("Digite o salario mensal: ");
		salarioMensal = input.nextDouble();
		if(salarioMensal > 0)
			employee2.setSalarioMensalFuncionario(salarioMensal);
		employee2.getSalarioMensalFuncionario();

		System.out.println();

		employee1.salarioAnual();
		employee2.salarioAnual();

		employee1.displaySalarioAnual();

		System.out.println();

		employee2.displaySalarioAnual();

		System.out.println();

		employee1.aumentoSalarioAnual();
		employee2.aumentoSalarioAnual();

		System.out.printf("Parabéns a %s %s e %s %s, voces receberam " +
			"um aumento de 10 porcento de salario!"+
			"\nseus novos salarios são: \n\n",
			employee1.getNomeFuncionario(), employee1.getSobrenomeFuncionario(),
			employee2.getNomeFuncionario(), employee2.getSobrenomeFuncionario());

		employee1.displayAumentoSalarioAnual();

		System.out.println();

		employee2.displayAumentoSalarioAnual();
	}
}
