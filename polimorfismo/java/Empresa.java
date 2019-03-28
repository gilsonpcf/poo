// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Polimorfismo em Java
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

public class Empresa {
	public static void main(String args[]) {
		Vendedor v = new Vendedor();
		FreeLancer f = new FreeLancer();
		
		v.setNome("Carlos");
		v.setSalarioBase(2000);
		v.setComissao(3000);
		
		System.out.println("Salario vendedor: " + obterSalarioDoFuncionario(v));
		
		f.setNome("Clara");
		f.setDiasTrabalhados(20);
		f.setValorDia(150);
		
		System.out.println("Salario free lancer: " + obterSalarioDoFuncionario(f));
	}
	
	public static float obterSalarioDoFuncionario(Funcionario funcionario) {
		float resposta = funcionario.calcularSalarioFinal();
		return resposta;
	}
}