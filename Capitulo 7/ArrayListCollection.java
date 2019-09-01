// fugra 7.24: ArrayListCollection.java
// demonstração de coleção ArrayList<T> genérica
import java.util.ArrayList;

public class ArrayListCollection{
	public static void main(String[] args) {
		// cria um novo ArrayList de strings com uma capacidade inicial de 10
		ArrayList<String> itens = new ArrayList<String>();

		itens.add("red"); // anexa um item a lista
		itens.add(0, "yellow"); // insere "yellow" no indice 0

		// cabeçalho

		System.out.print(
			"Exibe conteudo da lista com loop controlado por contador:");

		// exibe as cores na lista
		for (int i = 0; i < itens.size(); i++){
			System.out.printf(" %s", itens.get(i));
		}

		// exibe as cores usando for aprimorado no metodo display
		display(itens,
			"%nExibe conteudo da lista com for aprimorado:");

		itens.add("green"); // adicioona "green" ao fim da lista
		itens.add("yellow"); // adiciona "yellow" ao fim da lista
		display(itens, "Lista com dois novos elementos:");

		itens.remove("yellow"); // remove o primeiro "yellow"
		display(itens, "Remove primeira ocorrencia de yellow:");

		itens.remove(1); // remove o tem no indice 1
		display(itens, "Remove segundo elemento da lista (green):");

		// verifica se um valor esta na lista
		System.out.printf("\"red\" esta %sna lista%n",
			itens.contains("red") ? "":"não ");

		// exibe o numero de elementos na lista
		System.out.printf("Size: %s%n", itens.size());
	}

	// exibe elementos do ArrayList no console
	public static void display(ArrayList<String> itens, String header){
		System.out.printf(header); // exibe o cabeçalho

		// exibe cada elemento em itens
		for (String item : itens){
			System.out.printf(" %s", item);
		}

		System.out.println();
	}
} // fim da classse ArrayListCollection