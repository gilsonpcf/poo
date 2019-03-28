// Demonstração da coleção ArrayList genérica 
import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// cria um novo ArrayList de strings
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("red"); // acrescenta um item à lista
		items.add(0, "yellow"); // insere o valor no índice 0
		
		// cabeçalho
		System.out.println("Mostra o conteúdo da lista com um loop controlado por contador:");
		
		// exibe as cores na lista
		for (int i = 0; i < items.size(); i++)
			System.out.printf(" %s", items.get(i));
		
		// exibe as cores utilizando foreach no método display
		display(items, "\nMostra o conteúdo da lista com o comando for melhorado:");
		
		items.add("green"); // adiciona "green" ao final da lista
		items.add("yellow"); // adiciona "yellow" ao final da lista
		display(items, "Lista com dois novos elementos:");

		items.remove("yellow"); // remove o primeiro "yellow"
		display(items, "Remove a primeira instância de yellow:");

		items.remove(1); // remove o item no índice 1
		display(items, "Remove o segundo elemento da lista (green):");
		
		// verifica se um valor está na lista
		System.out.printf("\"red\" %sestá na lista\n", items.contains("red")?"":"não ");
		
		// exibe o número de elementos na lista
		System.out.printf("Tamanho: %s\n", items.size());
	} // fim de main

	// exibe os elementos do ArrayList no console
	public static void display(ArrayList<String> items, String header)
	{
		System.out.print(header); // exibe o cabeçalho
		
		// exibe cada elemento em items
		for (String item : items)
			System.out.printf(" %s", item);
		
		System.out.println(); // exibe o fim de linha
	} // fim do método display
} // fim da classe ArrayListCollection