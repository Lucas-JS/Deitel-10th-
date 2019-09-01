// figura 7.9: Card.java
// classe Carta representa uma carta do baralho

public class Carta{
	private final String face; // face da carta ("As","Dois"...)
	private final String naipe; // naipe da carta

	// construtor de dois argumentos inicializa face e naipe da carta
	public Carta(String faceCarta, String naipeCarta){
		this.face = faceCarta; // inicializa face da carta
		this.naipe = naipeCarta; // inicializa naipe da carta
	}

	// retorna representacao String de Carta
	public String toString(){
		return face + " de " + naipe;
	}
} // fim da classe Carta