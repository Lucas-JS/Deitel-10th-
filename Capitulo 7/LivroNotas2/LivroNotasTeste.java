// figura 7.19: GradeBookTest.java
// LivroNotasTeste cria o objeto LivroNotas utilizando um vetor bidimensional 
// das notas e, entao, invoca o metodo processaNotas para analisa-las
public class LivroNotasTeste{
	// metodo main inicia a execucao do programa
	public static void main(String[] args) {
		// vetor bidimensional de notas de aluno
		int[][] vetorNotas = {{97, 96, 70},
							  {68, 87, 90},
							  {94, 100, 90},
							  {100, 81, 82},
							  {83, 65, 85},
							  {78, 87, 65},
							  {85, 75, 83},
							  {91, 94, 100},
							  {76, 72, 84},
							  {87, 93, 73}};

		LivroNotas meuLivroNotas = new LivroNotas(
			"CS101 Introdução a programação em Java", vetorNotas);

		System.out.printf("Bem-vindo ao livro de notas para%n%s%n%n",
			meuLivroNotas.getNomeCurso());
		meuLivroNotas.processaNotas();							  
	}
} // fim da classe LivroNotasTeste