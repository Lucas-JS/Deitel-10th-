// ex 3.16 class HeartRates.java
// calculo de frequencia cardiaca por idade

public class HeartRates
{
	private String pacienteNome;
	private String pacienteSobrenome;
	private int dataDia;
	private int dataMes;
	private int dataAno;

	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano)
	{
		pacienteNome = nome;
		pacienteSobrenome = sobrenome;
		dataDia = dia;
		dataMes = mes;
		dataAno = ano;
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

    public void displayPaciente()
    {
    	System.out.printf("Nome: %s %s%n", getNome(), getSobrenome());
    	System.out.printf("Data de nascimento: %d/%d/%d%n", getDia(), getMes(), getAno());
    	System.out.printf("Idade aproximada: %d%n", calculaIdade());
    	System.out.printf("Taxa de batimento máxima: %d batimentos por minuto%n", maxRate());
    	System.out.printf("Taxa alvo entre %d e %d batimentos por minuto%n", alvoInf(), alvoSup());

    }

}