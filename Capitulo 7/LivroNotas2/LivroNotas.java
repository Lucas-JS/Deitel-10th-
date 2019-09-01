// figura 7.18: GradeBook.java
// classe LivroNotas utilizando um array bidimensional para armazenar notas

public class LivroNotas{
	private String nomeCurso; // nome de curso que este livro representa
	private int[][] notas; // vetor bidimensional de notas de aluno

	// construtor de dois argumentos inicializa nomeCurso e vetor de notas
	public LivroNotas(String nomeCurso, int[][] notas){
		this.nomeCurso = nomeCurso;
		this.notas = notas;
	}

	// metodo para configura o nome do curso
	public void setNomeCurso(String nomeCurso){
		this.nomeCurso = nomeCurso;
	}

	// metodo para recuperar o nome do curso 
	public String getNomeCurso(){
		return nomeCurso;
	}

	// realiza varias operacoes nos dados
	public void processaNotas(){
		// gera saida de vetor de notas
		saidaNotas();

		// chama metodos getMinimo e getMaximo
		System.out.printf("%n%s %d%n%s %d%n%n",
			"Menor nota no livro de notas é", getMinimo(),
			"Maior nota no livro de notas é", getMaximo());

		// gera a saida de grafico de distribuicao de notas de todas as notas em todos os testes
		saidaGraficoBarra();
	}

	// localiza a nota minima 
	public int getMinimo(){
		// supoe que o primeiro elemento do vetor de notas é o menor
		int menorNota = notas[0][0];

		// faz um loop pelas linhas do vetor de notas
		for (int[] estudanteNotas : notas){
			// faz um loop pelas colunas da linha atual
			for (int nota : estudanteNotas){
				// se a nota for menor que menorNota, atribui nota a menorNota
				if (nota < menorNota){
					menorNota = nota;
				}
			}
		}
		return menorNota;
	}

	// localiza nota maxima
	public int getMaximo(){
		// supoe que o primeiro elemento do vetor de notas é o maior
		int maiorNota = notas[0][0];

		// faz um loop pelar linhas do vetor de notas
		for (int[] estudanteNotas : notas){
			// faz um loop pelas colunas da linha atual
			for (int nota : estudanteNotas){
				// se a nota for maior que maiorNota, atribui essa nota a maiorNota
				if (nota > maiorNota){
					maiorNota = nota;
				}
			}
		}
		return maiorNota;
	}

	// determina a media do conjunto particular de notas
	public double getMedia(int[] conjuntoDeNotas){
		int total = 0;

		// soma as notas de aluno
		for (int nota : conjuntoDeNotas){
			total += nota;
		}

		// retorna media de notas
		return (double) total / conjuntoDeNotas.length;
	}

	// gera a saida do grafico de barras para exibir distribuicao total de notas
	public void saidaGraficoBarra(){
		System.out.println("Distribuição total de notas:");

		// armazena frequencia de notas em cada intervalo de 10 notas
		int[] frequencia = new int[11];

		// para cada nota em LivroNotas, incrementa a frequencia apropriada
		for (int[] estudanteNotas : notas){
			for (int nota : estudanteNotas){
				++frequencia[nota / 10];
			}
		}

		// para cada frequencia de nota, imprime barra no grafico
		for (int contador = 0; contador < frequencia.length; contador++){
			// gera a saida do rotulo de barra ("00-09: ",...,"90-99: ","100: " )
			if (contador == 10){
				System.out.printf("%5d: ", 100);
			}else{
				System.out.printf("%02d-%02d: ",
					contador * 10, contador * 10+9);
			}

			// imprime a barra de asteriscos
			for (int asteriscos = 0; asteriscos < frequencia[contador]; asteriscos++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// gera a saida do conteudo do vetor de notas
	public void saidaNotas(){
		System.out.printf("As notas são:%n%n");
		System.out.print("            "); // alinha titulos de coluna

		// cria um titilo de coluna para cada um dos testes
		for (int teste = 0; teste < notas[0].length; teste++){
			System.out.printf("Teste %d  ", teste + 1);
		}

		System.out.println("Média"); // titulo da coluna de media do aluno

		// cria linhas/colunas de texto que representam notas de vetor
		for (int estudante = 0; estudante < notas.length; estudante++){
			System.out.printf("Estudante %2d", estudante + 1);

			// gera saida de notas do aluno
			for (int teste : notas[estudante]){
				System.out.printf("%8d", teste);
			}

			// chama metodo getMedia para calcula a media do aluno;
			// passa linha de notas como o argumento para getMedia
			double media = getMedia(notas[estudante]);
			System.out.printf("%9.2f%n", media);

		}
	}
} // fim da classe LivroNotas
