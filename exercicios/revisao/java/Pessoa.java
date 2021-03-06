//import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void imprimeDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.printf("Idade: %d anos\n", calculaIdade());
		System.out.printf("Altura: %.2f m\n", altura);
	}

	public int calculaIdade() {
		//int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		Date date = new Date();
		int anoAtual = Integer.parseInt(dateFormat.format(date));

		int anoNascimento = Integer.parseInt(dataNascimento.substring(6, 10));

		int idade = anoAtual - anoNascimento;

		return idade;
	}
}
