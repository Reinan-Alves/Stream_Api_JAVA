package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		
		List<String> marcas = Arrays.asList("BMW ","Audi","Honda ");
		marcas.stream().map(nome -> nome.toUpperCase()).forEach(print);
		
		
		//Composiçã
		
		//Operador unario para receber a primeira Letra, obs: foi concatenada a um astring vazia por causa do retorno
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
		System.out.println("\nUsando Composição");
		
		marcas.stream().map(Utilitarios.maiuscula).map(primeiraLetra).map(Utilitarios::grito).forEach(print);
		
		
	}

}
