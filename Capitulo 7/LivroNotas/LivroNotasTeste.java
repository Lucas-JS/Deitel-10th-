// figura 7.15: GradeBookTest.java
// LivroNotasTeste cria um objeto LivroNotas utilizando um vetor de notas,e,
// entao, invoca o metodo processaNotas para analisá-las
public class LivroNotasTeste{
	// metodo main inicia a execucao de programa
	public static void main(String[] args){
		// vetor de notas de aluno
		int[] vetorNotas = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

		LivroNotas meuLivroNotas = new LivroNotas(
			"CS101 Introdução a programação Java", vetorNotas);
		System.out.printf("Bem-vindo ao Livro de notas para%n%s%n%n",
			meuLivroNotas.getNomeCurso());

		meuLivroNotas.processaNotas();
	}
} // fim da classe LivroNotasTeste