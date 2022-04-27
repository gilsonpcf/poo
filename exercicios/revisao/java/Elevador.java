public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int pessoasPresentes;

	public Elevador(int capacidade, int totalAndares) {
		inicializa(capacidade, totalAndares);
	}
	
	private void inicializa(int capacidade, int totalAndares) {
		this.capacidade = capacidade;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.pessoasPresentes = 0;
	}
	
	public void entra() {
		if (pessoasPresentes < capacidade) {
			pessoasPresentes++;
		} else {
			System.out.println("Elevador lotado!");
		}
	}
	
	public void sai() {
		if (pessoasPresentes > 0) {
			pessoasPresentes--;
		} else {
			System.out.println("Elevador vazio!");
		}
	}
	
	public void sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
		} else {
			System.out.println("Elevador está no último andar!");
		}
	}
	
	public void desce() {
		if (andarAtual > 0) {
			andarAtual--;
		} else {
			System.out.println("Elevador está no térreo!");
		}
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	
	public int getTotalAndares() {
		return totalAndares;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public int getPessoasPresentes() {
		return pessoasPresentes;
	}
	
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setPessoasPresentes(int pessoasPresentes) {
		this.pessoasPresentes = pessoasPresentes;
	}
}
