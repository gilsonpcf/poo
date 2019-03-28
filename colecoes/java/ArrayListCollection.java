// Demonstra��o da cole��o ArrayList gen�rica 
import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// cria um novo ArrayList de strings
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("red"); // acrescenta um item � lista
		items.add(0, "yellow"); // insere o valor no �ndice 0
		
		// cabe�alho
		System.out.println("Mostra o conte�do da lista com um loop controlado por contador:");
		
		// exibe as cores na lista
		for (int i = 0; i < items.size(); i++)
			System.out.printf(" %s", items.get(i));
		
		// exibe as cores utilizando foreach no m�todo display
		display(items, "\nMostra o conte�do da lista com o comando for melhorado:");
		
		items.add("green"); // adiciona "green" ao final da lista
		items.add("yellow"); // adiciona "yellow" ao final da lista
		display(items, "Lista com dois novos elementos:");

		items.remove("yellow"); // remove o primeiro "yellow"
		display(items, "Remove a primeira inst�ncia de yellow:");

		items.remove(1); // remove o item no �ndice 1
		display(items, "Remove o segundo elemento da lista (green):");
		
		// verifica se um valor est� na lista
		System.out.printf("\"red\" %sest� na lista\n", items.contains("red")?"":"n�o ");
		
		// exibe o n�mero de elementos na lista
		System.out.printf("Tamanho: %s\n", items.size());
	} // fim de main

	// exibe os elementos do ArrayList no console
	public static void display(ArrayList<String> items, String header)
	{
		System.out.print(header); // exibe o cabe�alho
		
		// exibe cada elemento em items
		for (String item : items)
			System.out.printf(" %s", item);
		
		System.out.println(); // exibe o fim de linha
	} // fim do m�todo display
} // fim da classe ArrayListCollection