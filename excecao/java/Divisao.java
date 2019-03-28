import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, d = 0;
		boolean repete = true;

		do {
			try {
				System.out.println("Informe o primeiro n�mero (A): ");
				a = entrada.nextInt();

				System.out.println("Informe o segundo n�mero (B): ");
				b = entrada.nextInt();

				d = a / b;
				repete = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Informe um n�mero!");
				entrada.nextLine(); // Limpa buffer
			}
			catch (ArithmeticException e) {
				System.out.println("N�o � poss�vel divis�o por zero!");
			}
			catch (Exception e) {
				System.out.println("O programa executou uma opera��o ilegal...");
			}
		}
		while (repete);

		System.out.println("Resultado (A/B): " + d);
	}
}