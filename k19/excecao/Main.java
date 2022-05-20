import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Conta c = new Conta();
        c.imprimeExtrato();
        
        try {
        
            System.out.print("Informe o valor: ");
            double valor = entrada.nextDouble();
            
            c.deposita(valor);
            
            c.imprimeExtrato();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}