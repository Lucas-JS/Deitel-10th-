// figura 5.5: Sum.java
// somando inteiros com a instrução for.
public class Soma {

	public static void main(String[] args){
	int total = 0;

	for (int numero = 2; numero <= 20 ; numero +=2 ) {
		total += numero;
	}
	System.out.printf("a soma é %d%n: ",total);

	}	
}