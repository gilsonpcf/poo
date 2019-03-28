
public class Ornitorrinco extends Animal implements Mamifero, Ave
{
	public Ornitorrinco(String nome)
	{
		super(nome);
	}
	
	public void poeOvo()
	{
		System.out.println("Estou botando um ovo!");
	}
	
	public void mamar()
	{
		System.out.println("Estou mamando");
	}
}