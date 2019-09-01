// Exercicio 3.12 Invoice.java
// Gerar fatura para loja de suprimentos de informatica

public class Invoice
{
	private String numeroNota;// variavel de instancia
	private String descricaoItem;//variavel de instancia
	private int  quantidadeComprada;// variavel de instancia
	private double precoPorItem;// variavel de instancia


	//construtor recebe dois parametros
	public Invoice(String numero, String descricao, int quantidade, double preco)//nome do construtor é o nome da classe
	{
		this.numeroNota = numero;
		this.descricaoItem = descricao;
		this.quantidadeComprada = quantidade;
		this.precoPorItem = preco;
	}
	
	// metodo que insere o numero da nota
	public void setNumeroNota(String numero){
		this.numeroNota = numero;
	}
	// metodo para recuperar o numero da nota
	public String getNumeroNota(){
		return numeroNota;
	}
	//metodo que insere descricao do item
	public void setDescricaoItem(String descricao){
		this.descricaoItem = descricao;
	}
	//metodo que recupera descricao do item
	public String getDescricaoItem(){
		return descricaoItem;
	}
	// metodo para inserir quantidade
	public void setQuantidadeComprada(int quantidade){
			this.quantidadeComprada = quantidade;
	}
	//metodo para retornar quantidade
    public int getQuantidadeComprada(){
    	return quantidadeComprada;
    }
    //metodo para inserir preco do item
    public void setPrecoPorItem(double preco){
			this.precoPorItem = preco;
    }
    //metodo para retornar preco do item
    public double getPrecoPorItem(){
    	return precoPorItem;
    }
    //metodo para calcular o preco do invoice
    public double getInvoiceAmount(){
    	double calcularValorTotal;
    	
    	calcularValorTotal = quantidadeComprada * precoPorItem;

    	return calcularValorTotal;
    }
	
}//fim da classe Invoice
