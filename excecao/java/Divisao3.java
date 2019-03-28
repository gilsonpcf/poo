import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	public static int divide(int x, int y) throws Exception {
		if (y == 0)
			throw new Exception("Denominador n�o pode ser zero.");
			
		return x / y;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b, d = 0;
		boolean repete = true;

		do {
			try {
				System.out.println("Informe o primeiro n�mero (A): ");
				a = entrada.nextInt();
				
				if (a < 0 || a > 10)
					throw new Tratamento("Valor fora do intervalo (0 a 10).");

				System.out.println("Informe o segundo n�mero (B): ");
				b = entrada.nextInt();

				//if (b == 0)
				//	throw new Exception("Valor n�o pode ser zero.");

				d = divide(a, b);
				
				if (d == 2) {
					System.out.println("Executando o return...");
					return;
				}
				
				repete = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Informe um n�mero!");
				entrada.nextLine(); // Limpa buffer
			}
			catch (ArithmeticException e) {
				System.out.println("N�o � poss�vel divis�o por zero!");
			}
			catch (Tratamento e) {
				System.out.println("Tratamento");
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				System.out.println("O programa executou uma opera��o ilegal...");
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Executando o c�digo do bloco finally...");
			}
		}
		while (repete);

		System.out.println("Resultado (A/B): " + d);
	}
}