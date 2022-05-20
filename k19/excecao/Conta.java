public class Conta {
    int numero;
    double saldo;
    double limite = 100;

    public void deposita(double valor) throws Exception {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new Exception("Valor inválido");
        }
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void imprimeExtrato() {
        System.out.println(" SALDO : " + this.saldo);
    }

    public double consultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }
}