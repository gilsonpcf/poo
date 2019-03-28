import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, d = 0;
		boolean repete = true;

		do {
			try {
				System.out.println("Informe o primeiro número (A): ");
				a = entrada.nextInt();
				
				if (a < 0 || a > 10)
					throw new Exception("Valor fora do intervalo (0 a 10).");

				System.out.println("Informe o segundo número (B): ");
				b = entrada.nextInt();

				if (b == 0)
					throw new Exception("Valor não pode ser zero.");

				d = a / b;
				
				if (d == 2) {
					System.out.println("Executando o return...");
					return;
				}
				
				repete = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Informe um número!");
				entrada.nextLine(); // Limpa buffer
			}
			catch (ArithmeticException e) {
				System.out.println("Não é possível divisão por zero!");
			}
			catch (Exception e) {
				System.out.println("O programa executou uma operação ilegal...");
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Executando o código do bloco finally...");
			}
		}
		while (repete);

		System.out.println("Resultado (A/B): " + d);
	}
}