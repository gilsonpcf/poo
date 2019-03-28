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

				System.out.println("Informe o segundo número (B): ");
				b = entrada.nextInt();

				d = a / b;
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
			}
		}
		while (repete);

		System.out.println("Resultado (A/B): " + d);
	}
}