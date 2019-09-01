// figura 7.14: GradeBook.java
// classe LivroNotas utilizando um vetor para armazenar notas de teste.

public class LivroNotas{
	private String nomeCurso; // nome do curso que esse LivroNotas representa
	private int[] notas; // vetor de notas de aluno

	// construtor
	public LivroNotas(String nomeCurso, int[] notas){
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

		// chama metodo getMedia para calcular a nota media
		System.out.printf("%nMedia da classe é %.2f%n", getMedia());

		// chama metodo getMinimo e getMaximo
		System.out.printf("Menor nota é %d%nMaior nota é %d%n%n", 
			getMinimo(),getMaximo());

		// chama saidaGraficoBarra para imprimir grafico de distribuicao de notas
		saidaGraficoBarra();
	}

	// localiza nota minima
	public int getMinimo(){
		int menorNota = notas[0]; // supoe que notas[0] é a menor nota

		// faz um loop pelo vetor de notas
		for (int nota : notas){
			// se nota for mais baixa de menorNota, atribui essa nota a menorNota
			if (nota < menorNota){
				menorNota = nota; // nova nota mais baixa
			}
		}
		return menorNota;
	}

	// localiza nota maxima
	public int getMaximo(){
		int maiorNota = notas[0]; // supoe que notas[0] é a maior nota

		// faz o loop pelo vetor de notas
		for (int nota : notas){
			// se a nota for mais que maiorNota, atribui essa nota a maiorNota
			if (nota > maiorNota){
				maiorNota = nota; // nova nota mais alta
			}
		}
		return maiorNota;
	}

	// determina media para o teste
	public double getMedia(){
		int total = 0;

		// soma notas de um aluno
		for (int nota : notas){
			total += nota;
		}
		// retorna media de notas
		return (double)total / notas.length;
	}

	// gera a saida do grafico de barras exibindo distribuicao de notas
	public void saidaGraficoBarra(){
		System.out.println("Distribuição de notas:");

		// armazena frequencia de notas em cada intervalo de 10 notas
		int[] frequencia = new int[11];

		// para cada nota, incrementa a frequencia apropriada
		for (int nota : notas) {
			++frequencia[nota / 10];
		}

		// para cada frequencia de nota, imprime barra no grafico
		for (int contador = 0; contador < frequencia.length; contador++){
			//gera saida do rotulo de barra ("00-09:",....,"90-99: ", "100: ")
			if (contador == 10){
				System.out.printf("%5d: ", 100);
			}else{
				System.out.printf("%02d-%02d: ",
						contador * 10, contador * 10 + 9);
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
		System.out.printf("As notas são: %n%n");

		// gera a saida da nota de cada aluno 
		for (int estudante = 0; estudante < notas.length; estudante++){
		System.out.printf("Estudante %2d: %3d%n",
			estudante + 1, notas[estudante]);
	    }	
	}
	
	
} // fim da classe LivroNotas