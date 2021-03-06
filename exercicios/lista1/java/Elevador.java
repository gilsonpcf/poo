public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas;

    public Elevador(int capacidade, int totalAndares) {
        inicializa(capacidade, totalAndares);
        imprimeDados();
    }

    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // Térreo
        this.qtdPessoas = 0; // Elevador vazio
    }

    public void entra() {
        if (qtdPessoas < capacidade) {
            qtdPessoas++;
        }

        imprimeDados();
    }

    public void sai() {
        if (qtdPessoas > 0) {
            qtdPessoas--;
        }

        imprimeDados();
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }

        imprimeDados();
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        }

        imprimeDados();
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public void imprimeDados() {
        System.out.println("Andar: " + andarAtual);
        System.out.println("Pessoas: " + qtdPessoas);
        System.out.println();
    }
}