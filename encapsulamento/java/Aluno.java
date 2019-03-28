// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Encapsulamento em Java
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Aluno {
	private String nome;
	private int idade;
	private String turma;
	private String dataMatricula;

	public Aluno() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		dataMatricula = dateFormat.format(date);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
		defineTurma();
	}

	public int getIdade() {
		return this.idade;
	}

	public String getTurma() {
		return this.turma;
	}

	public String getDataMatricula() {
		return this.dataMatricula;
	}

	private void defineTurma() {
		if (this.idade < 18)
			this.turma = "adolescente";
		else if (this.idade < 40)
			this.turma = "jovem";
		else if (this.idade < 60)
			this.turma = "adulto";
		else
			this.turma = "idoso";
	}
}