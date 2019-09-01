//ex 3.14 Classe Date
//displayDate

public class Date
{
	private int dataDia;
	private int dataMes;
	private int dataAno;

	public Date(int dia, int mes, int ano)
	{
		dataDia = dia;
		dataMes = mes;
		dataAno = ano;
	}

	public void setDia(int dia){
		dataDia = dia;
	}

	public int getDia(){
		return dataDia;
	}
	public void setMes(int mes){
		dataMes = mes;
	}

	public int getMes(){
		return dataMes;
	}
	public void setAno(int ano){
		dataAno = ano;
	}

	public int getAno(){
		return dataAno;
	}

	public void displayDate()
	{
		System.out.printf("Data= %d/%d/%d%n",getDia(), getMes(), getAno()); 
	}



} 