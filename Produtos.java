package streamApi;

public class Produtos {
	final String nome;
	final double preco;
	final int  desconto;
	final boolean frete;
	
	public Produtos(String nome, double preco, int desconto, boolean frete) {
		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
			
	}
	
	public double aplicarDesconto(){
		
		double precoComDesconto = this.preco - (this.preco * (this.desconto/100));
		
		return precoComDesconto;
		
	}

}
