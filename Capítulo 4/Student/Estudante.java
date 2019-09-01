// figura 4.4: Student.java
// Classe Estudante que armazena o nome e a media de um aluno
public class Estudante
{
	private String nome;
	private double media;

	//construtor inicializa variáveis de instancia
	public Estudante(String nome, double media)
	{
		this.nome = nome;

		//valida que a média é > 0.0 e <=100.0; caso contrário,
		// armazena o valor padrão da média da variável de instancia (0.0)
		if (media > 0.0)
			if (media <= 100.0)
				this.media = media; //atribui à variável de instância
	}

	// define o nome de Estudante
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	//recupera o nome de Estudante
	public String getNome()
	{
		return nome;
	}

	//define a media de Estudante
	public void setMedia(double estudanteMedia)
	{
		//valida que a media é > 0.0 e <= 100.0; caso contrario,
		//armazena o valor atual da media da variavel de instancia
		if (media > 0.0)
			if (media <= 100.0)
				this.media = media; // atribui à variável de instância
	}

	//recupera a media de Estudante
	public double getMedia()
	{
		return media;
	}

	// determina e retorna a letra da nota de Estudante
	public String getLetraNota()
	{
		String letraNota = ""; //inicializado como uma string vazia

		if (media >= 90.0)
			letraNota = "A";
		else if (media >= 80.0)
			letraNota = "B";
		else if (media >= 70.0)
			letraNota = "C";
		else if (media >= 60.0)
			letraNota = "D";
		else
			letraNota = "F";

		return letraNota;
	}
}// finaliza classe Estudante