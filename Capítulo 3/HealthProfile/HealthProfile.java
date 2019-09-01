// ex 3.17 class HealthProfile.java
// registros de saude

public class HealthProfile
{
	private String pacienteNome;
	private String pacienteSobrenome;
	private int dataDia;
	private int dataMes;
	private int dataAno;
	private double pacienteAltura;
	private double pacientePeso;

	public HealthProfile(String nome, String sobrenome, int dia, int mes, int ano, double altura, int peso)
	{
		pacienteNome = nome;
		pacienteSobrenome = sobrenome;
		dataDia = dia;
		dataMes = mes;
		dataAno = ano;
		pacienteAltura = altura;
		pacientePeso = peso;
	}

	public void setNome(String nome)
	{
		pacienteNome = nome;
	}

	public String getNome()
	{
		return pacienteNome;
	}

	public void setSobrenome(String sobrenome)
	{
		pacienteSobrenome = sobrenome;
	}

	public String getSobrenome()
	{
		return pacienteSobrenome;
	}

	public void setDia(int dia)
	{
		dataDia = dia;
	}

	public int getDia()
	{
		return dataDia;
	}

	public void setMes(int mes)
	{
		dataMes = mes;
	}

	public int getMes()
	{
		return dataMes;
	}

	public void setAno(int ano)
	{
		dataAno = ano;
	}

	public int getAno()
	{
		return dataAno;
	}

	public void setAltura(double altura)
	{
		pacienteAltura = altura;
	}

	public double getAltura()
	{
		return pacienteAltura;
	}

	public void setPeso(double peso)
	{
		pacientePeso = peso;
	}

	public double getPeso(){
		return pacientePeso;
	}

	public int calculaIdade()
	{
		int idade;

		idade = 2018 - dataAno;

		return idade;
		
	}

	public int maxRate()
    {
    	int maxRate;
	    maxRate = 220 - calculaIdade();
	    return maxRate;
    }

    public int alvoInf()
    {
    	int alvoInf;
    	alvoInf = ((maxRate() * 50)/100);
    	return alvoInf;
    }

    public int alvoSup()
    {
    	int alvoSup;
    	alvoSup = ((maxRate() *85)/100);
    	return alvoSup;
    }

    public double calculaImc()
    {
    	double imc;
    	imc = pacientePeso / (Math.pow(pacienteAltura,2));
    	return imc;
    }

    public void displayPaciente()
    {
    	System.out.printf("Nome: %s %s%n", getNome(), getSobrenome());
    	System.out.printf("Data de nascimento: %d/%d/%d%n", getDia(), getMes(), getAno());
    	System.out.printf("Idade aproximada: %d%n", calculaIdade());
    	System.out.printf("Taxa de batimento máxima: %d batimentos por minuto%n", maxRate());
    	System.out.printf("Taxa alvo entre %d e %d batimentos por minuto%n", alvoInf(), alvoSup());
    	System.out.printf("Seu IMC é de %f%n", calculaImc());
    	
    	if (calculaImc() < 18.5){
			System.out.println("Voce está abaixo do peso ideal!");
		}else
		if (calculaImc() >=18.5 && calculaImc() <=24.9){
			System.out.println("Voce esta dentro do peso ideal! ");
		}else
		if (calculaImc() >=25 && calculaImc() <= 29.9){
		System.out.println("Voce esta acima do peso ideal! ");
	    }else
	    System.out.println("Voce esta obeso(a), procure um medico!");

	    System.out.println("                                                 ");

		System.out.println("=================================================");
		System.out.println("=================================================");
		System.out.println("                                                 ");

		System.out.println("                  TABELA IMC");
		System.out.println("                                                 ");

		System.out.println("     	Abaixo do peso: IMC menor que 18.5");
		System.out.println("                                                 ");

		System.out.println("           Normal: IMC entre 18.5 e 24.9");
		System.out.println("                                                 ");

		System.out.println("        Acima do peso: IMC entre 25 e 29.9");
		System.out.println("                                                 ");

		System.out.println("              obeso: IMC acima de 30");
		System.out.println("                                                 ");

        System.out.println("                                                 ");
		System.out.println("=================================================");
		System.out.println("=================================================");

    }

}