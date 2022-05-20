public class Conta {
    int numero;
    double saldo;
    double limite = 100;
    Agencia agencia;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void imprimeExtrato() {
        System.out.println("SALDO: " + this.saldo);
    }

    public double consultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }
}