//figura 5.11: AutoPolicy.java
// classe que representa uma apolice de seguro de automovel.
public class Apolice{
	private int numConta; // numero da conta da apolice
	private String marcaModelo; // carro ao qual a apolice é aplicada
	private String estado; // abreviatura do estado com duas letras

	// construtor
	public Apolice(int numConta, String marcaModelo, String estado){
		this.numConta = numConta;
		this.marcaModelo = marcaModelo;
		this.estado = estado;
	}

	//define o numConta
	public void setNumConta(int numConta){
		this.numConta = numConta;
	}

	// retorna o numConta
	public int getNumConta(){
		return numConta;
	}

	// configura o marcaModelo
	public void setMarcaModelo(String marcaModelo){
		this.marcaModelo = marcaModelo;
	}

	// retorna o marcaModelo
	public String getMarcaModelo(){
		return marcaModelo;
	}

	// define o estado
	public void setEstado(String estado){
		this.estado = estado;
	}

	// retorna o estado
	public String getEstado(){
		return estado;
	}

	// metodo predicado é retornado se o estado tem seguros "sem culpa"
	public boolean ehEstadoSemCulpa(){
		boolean estadoSemCulpa;
	

		// determina se o estado tem seguros de automovel "sem culpa"
		switch (getEstado()) { // obtem a abrevaitura do estado do objeto Apolice
			case "MA": case "NJ": case "NY": case "PA":
				estadoSemCulpa = true;
				break;
			default:
				estadoSemCulpa = false;
				break; 		
		}		

		return estadoSemCulpa;
	}	
} // fim da classe Apolice