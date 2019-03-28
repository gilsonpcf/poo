// Disciplina: Programa��o Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : M�todos construtores e destrutores em Java
// Fonte     : Ascencio e Campos - Fundamentos da Programa��o de Computadores (3� ed.)

import java.util.Scanner;

public class Exemplo
{
	//Definindo a classe Produto
	private static class Produto
	{
		public float valor;
		public String tipo;
		
		public Produto()
		{
			valor = 0;
			tipo = "";
		}
		
		public float valorImposto()
		{
			float i;
			
			if (valor < 500)
				i = valor * 10/100;
			else
				i = valor * 15/100;
			return i;
		}
	}
	
	public static void main(String args[])
	{
		Scanner dado;
		dado = new Scanner(System.in);
		
		Produto p = new Produto();
		
		float preco, imp;
		String tipo;
		
		System.out.println("digite o pre�o do produto: ");
		preco = dado.nextFloat();
		
		System.out.println("digite o tipo do produto: ");
		tipo = dado.next();
		
		p.valor = preco;
		p.tipo = tipo;
		
		System.out.println("\nPre�o do produto = " + p.valor);
		System.out.println("\nTipo do produto = " + p.tipo);
		
		imp = p.valorImposto();
		System.out.println("\nImposto = " + imp);
	}
}