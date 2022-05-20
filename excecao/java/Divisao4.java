import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a, b, c;

        try {
            
            System.out.print("Informe o valor de A: ");
            a = entrada.nextInt();

            System.out.print("Informe o valor de B: ");
            b = entrada.nextInt();
            
            c = a / b;
            
            System.out.println("A/B = " + c);
            
        } catch (ArithmeticException e) {
            System.out.println("Divisão impossível");
        } catch (InputMismatchException e) {
            System.out.println("Entrada de dados inválida.");
        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Segue o jogo...");
    }
}