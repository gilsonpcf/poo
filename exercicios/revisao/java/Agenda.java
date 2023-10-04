import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void armazenaPessoa(String nome, String dataNascimento, double altura) {
		pessoas.add(new Pessoa(nome, dataNascimento, altura));
	}
	
	public void removePessoa(String nome) {
		pessoas.remove(buscaPessoa(nome));
	}
	
	public int buscaPessoa(String nome) {
		for (Pessoa p : pessoas) {
			if (p.getNome().equals(nome)) {
				return pessoas.indexOf(p);
			}
		}

		return -1;
	}
	
	public void imprimeAgenda() {
		for (Pessoa x : pessoas) {
			x.imprimeDados();
			System.out.println();
		}
	}
	
	public void imprimePessoa(int index) {
		pessoas.get(index).imprimeDados();
	}
}
