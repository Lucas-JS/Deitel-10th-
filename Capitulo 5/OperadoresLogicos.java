// figura 5.19: LogicalOperators.java
// operadores logicos.

public class OperadoresLogicos{

	public static void main(String[] args){
		// cria a tabela-verdade para o operador && (E condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
			"Condicional AND (&&)", "false && false", (false && false),
			"false && true", (false && true),
			"true && false", (true && false),
			"true && true", (true && true));

		// cria a tabela verdade para o operador || (OU condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
			"Condicional OR (||)", "false || false", (false || false),
			"false || true", (false || true),
			"true || false", (true || false),
			"true || true", (true || true));;

		// cria a tabela verdade para o operador & (E logico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
			"Boolean logical AND (&)", "false & false", (false & false),
			"false & true", (false & true),
			"true & false", (true & false),
			"true & false", (true & true));

		// cria a tabela verdade para o operador | (OU inclusivo logico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
			"Boolean logical inclusive OR (|)",
			"false | false", (false | false),
			"false | true", (false | true),
			"true | false", (true | false),
			"true | true", (true | true));

		// cria a tabela-verdade para o operador ^(OU exclusivo lógico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
			"Boolean logical exclusive OR(^)",
			"false ^ false", (false ^ false),
			"false ^ true", (false ^ true),
			"true ^ false", (true ^ false),
			"true ^ true", (true ^ true));

		// cria a tabele-verdade para o operador ! (negacao logica)
		System.out.printf("%s%n%s: %b%n%s:%b%n", "Logical NOT (!)",
			"!false", (!false), "!true", (!true));
	}
}