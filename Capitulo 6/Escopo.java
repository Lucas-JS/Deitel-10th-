// figura 6.9: Scope.java
// a classe Escopo demonstra os escopos de campo e de variavel local.

public class Escopo{
	// campo acessivel para todos os metodos dessa classe
	private static int x = 1;

	// o metodo main cria e inicializa a variavel local x
	// e chama os metodos usaVariavelLocal e usaCampo
	public static void main(String[] args) {
		int x = 5; // variavel local x do metodo sombreia o campo x

		System.out.printf("X local no main é %d%n", x);

		usaVariavelLocal(); // usaVariavelLocal tem uma variavel local x
		usaCampo(); // usaCampo utiliza o campo x da classe Escopo
		usaVariavelLocal(); // reinicializa a variavel local x
		usaCampo(); // campo x da classe Escopo retém seu valor

		System.out.printf("%nX local no main é %d%n", x);
	}

	// cria e inicializa a variavel local x durante cada chamada
	public static void usaVariavelLocal(){
		int x = 25; // inicializa toda vez que usaVariavelLocal é chamado

		System.out.printf("%nX local ao entrar no metodo usaVariavelLocal é %d%n", x);
		++x; // modifica a variavel local x desse metodo
		System.out.printf("%nX local depois de sair do metodo usaVariavelLocal é %d%n", x);
	}

	// modifica o campo x da classe Escopo durante a chamada
	public static void usaCampo(){
		System.out.printf("%nCampo x ao entrar no metodo usaCampo é %d%n", x);
		x *=10; // modifica o campo x da classe Escopo
		System.out.printf("Campo x depois de sair do metodo usaCampo é %d%n", x);
	}
}  // fim da classe Escopo
