// figura 6.10: MethodOverload.java
// declaracaoes de metodos sobrecarregados

public class MetodoSobrecarregado{
	// teste de metodos raizQuadrada sobrecarregados
	public static void main(String[] args) {
		System.out.printf("Raiz quadrada do inteiro 7 é %d%n", raizQuadrada(7));
		System.out.printf("Raiz quadrada do double 7.5 é %f%n", raizQuadrada(7.5));
	}

	// metodo raizQuadrada com argumento int
	public static int raizQuadrada(int intValor){
		System.out.printf("%nChamada a raizQuadrada com argumento int: %d%n", intValor);
		return intValor * intValor;
	}

	// metodo raizQuadrado com argumento double
	public static double raizQuadrada(double doubleValor){
		System.out.printf("%nChamada a raizQuadrada com argumento double: %f%n", doubleValor);
		return doubleValor * doubleValor;
	}
} // fim de classe MetodoSobrecarregado