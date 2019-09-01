// figura 4.5: StudentTest.java
// cria e testa objetos Estudante.
public class EstudanteTeste
{
	public static void main(String[] args)
    {
		Estudante conta1 = new Estudante ("Lucas Silva", 93.5);
		Estudante conta2 = new Estudante ("Noeli Dantas", 72.75);

		System.out.printf("A letra da nota de %s é: %s%n",
			conta1.getNome(), conta1.getLetraNota());
		System.out.printf("A letra da nota de %s é: %s%n",
			conta2.getNome(), conta2.getLetraNota());
	}
}// fim da classe StudentTest