public class Agenda {
	private Pessoa pessoas[] = new Pessoa[10];
	private int quantidade;

	public Agenda() {
		quantidade = 0;
	}

	public void armazenaPessoa(String nome, String dataNascimento, double altura) {
		if (quantidade < 10) {
			pessoas[quantidade] = new Pessoa(nome, dataNascimento, altura);
			quantidade++;
		}
		else
			System.out.println("Agenda cheia!");
	}

	public void removePessoa(String nome) {
		int posicao = buscaPessoa(nome);

		if (posicao >= 0) {
			for (int i = posicao; i < (quantidade-1); i++) {
				pessoas[i] = pessoas[i+1];
			}

			quantidade--;
		}
		else
			System.out.println("Não existe pessoa com este nome na agenda!");
	}

	public int buscaPessoa(String nome) {
		for (int i = 0; i < quantidade; i++) {
			if (pessoas[i].getNome().equals(nome)) {
				return i;
			}
		}

		return -1;
	}

	public void imprimeAgenda() {
		for (int i = 0; i < quantidade; i++) {
			pessoas[i].imprimir();
			System.out.println();
		}
	}

	public void imprimePessoa(int index) {
		pessoas[index].imprimir();
	}
}