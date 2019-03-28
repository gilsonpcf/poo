// Disciplina: Programação Orientada a Objetos
// Professor : Gilson Pereira
// Assunto   : Métodos construtores e destrutores em Java (com parâmetros)
// Fonte     : Ascencio e Campos - Fundamentos da Programação de Computadores (3ª ed.)

import java.util.Scanner;

public class Exemplo
{
	//Definindo a classe Produto
	private static class Produto
	{
		public float valor;
		public String tipo;
		
		public Produto(float v, String t)
		{
			valor = v;
			tipo = t;
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
		
		float preco, imp;
		String tipo;
		
		System.out.println("digite o preço do produto: ");
		preco = dado.nextFloat();
		
		System.out.println("digite o tipo do produto: ");
		tipo = dado.next();
		
		Produto p = new Produto(preco, tipo);
		
		System.out.println("\nPreço do produto = " + p.valor);
		System.out.println("\nTipo do produto = " + p.tipo);
		
		imp = p.valorImposto();
		System.out.println("\nImposto = " + imp);
	}
}