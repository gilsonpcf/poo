// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Encapsulamento em Java
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

import java.util.Scanner;

public class Academia {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Aluno a = new Aluno();
		
		System.out.print("Digite o nome do novo aluno: ");
		a.setNome(entrada.nextLine());
		
		System.out.print("Digite a idade do novo aluno: ");
		a.setIdade(entrada.nextInt());
		
		System.out.println("Ficha cadastral do novo aluno");
		System.out.println("Nome: " + a.getNome());
		System.out.println("Idade: " + a.getIdade());
		System.out.println("Data da matrícula: " + a.getDataMatricula());
		System.out.println("Turma: " + a.getTurma());
	}
}
