package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {
	public static void main(String[] args) {
		/*
		 * mostrar todos os produtos de um site que estão com desconto maior que 30% e
		 * com frete gratis criar produto com preco,nome,desconto e frete com o map
		 * colocar o nome e o preco e informar que ele sera destaque
		 */

		Produtos p1 = new Produtos("Monitor", 800.00, 31, true);
		Produtos p2 = new Produtos("Mouse", 50.00, 40, false);
		Produtos p3 = new Produtos("Teclado", 200.00, 33, true);
		Produtos p4 = new Produtos("Headset", 150.00, 29, true);
		Produtos p5 = new Produtos("Pen drive", 80.00, 30, true);
		
		List<Produtos> listaProdutos = Arrays.asList(p1,p2,p3,p4,p5); 

		Predicate<Produtos> destaqueDesconto = p ->  p.desconto > 30;
		Predicate<Produtos> destaqueFrete = p ->  p.frete == true;
		
		Function<Produtos, String> exibeProdutoDestaque = p -> "O " + p.nome + " esta em destaque com " + 
		p.desconto + "% de desconto e frete gratis!!!";
		
		listaProdutos.stream().filter(destaqueDesconto).filter(destaqueFrete).map(exibeProdutoDestaque).forEachOrdered(System.out::println);
		
	}

}
