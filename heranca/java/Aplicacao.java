// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Herança em Java
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

public class Aplicacao {
	public static void main(String[] args) {
		System.out.println("Iniciando o processo de criação de um objeto Pessoa");
		Pessoa p = new Pessoa();
		
		System.out.println("\nIniciando o processo de criação de um objeto Aluno");
		Aluno a = new Aluno();
		
		System.out.println("\nIniciando o processo de criação de um objeto Funcionario");
		Funcionario f = new Funcionario();
		
		p.setNome("Vanderlei");
		p.setEndereco("Rua 15 de novembro, 345");
		p.setDataNascimento("12/05/1960");
		
		a.setNome("Maria");
		a.setEndereco("Rua 26 de agosto, 1874");
		a.setDataNascimento("31/01/1990");
		a.setCurso("Ciência da Computação");
		a.setSemestre("4º");
		
		f.setNome("Pedro");
		f.setEndereco("Rua 7 de setembro, 3875");
		f.setDataNascimento("27/10/1980");
		f.setCargo("Arquiteto de software");
		f.setSalario(10000);
		
		System.out.println("\nDados cadastrados no objeto p - do tipo Pessoa");
		System.out.println("Nome: " + p.getNome());
		System.out.println("Endereço: " + p.getEndereco());
		System.out.println("Data de nascimento: " + p.getDataNascimento());
		
		System.out.println("\nDados cadastrados no objeto a - do tipo Aluno");
		System.out.println("Nome: " + a.getNome());
		System.out.println("Endereço: " + a.getEndereco());
		System.out.println("Data de nascimento: " + a.getDataNascimento());
		System.out.println("Curso: " + a.getCurso());
		System.out.println("Semestre: " + a.getSemestre());
		
		System.out.println("\nDados cadastrados no objeto f - do tipo Funcionario");
		System.out.println("Nome: " + f.getNome());
		System.out.println("Endereco: " + f.getEndereco());
		System.out.println("Data de nascimento: " + f.getDataNascimento());
		System.out.println("Cargo: " + f.getCargo());
		System.out.println("Salário: R$ " + f.getSalario());
	}
}