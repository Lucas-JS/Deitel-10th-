// figura 4.4: Student.java
// Classe Student que armazena o nome e a media de um aluno
public class Student
{
	private String name;
	private double average;

	//construtor inicializa variáveis de instancia
	public Student(String name, double average)
	{
		this.name = name;

		//valida que a média é > 0.0 e <=100.0; caso contrário,
		// armazena o valor padrão da média da variável de instancia (0.0)
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; //atribui à variável de instância
	}

	// define o nome de Student
	public void setName(String name)
	{
		this.name = name;
	}

	//recupera o nome de Student
	public String getName()
	{
		return name;
	}

	//define a media de Student
	public void setAverage(double studentAverage)
	{
		//valida que a media é > 0.0 e <= 100.0; caso contrario,
		//armazena o valor atual da media da variavel de instancia
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // atribui à variável de instância
	}

	//recupera a media de Student
	public double getAverage()
	{
		return average;
	}

	// determina e retorna a letra da nota de Student
	public String getLetterGrade()
	{
		String letterGrade = ""; //incializado como uma string vazia

		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";

		return letterGrade;
	}
}// finaliza classe Student