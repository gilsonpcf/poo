// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Herança em Java
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

public class Aluno extends Pessoa {
	private String curso;
	private String semestre;

	public Aluno() {
		System.out.println("Executando construtor da classe Aluno");
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}