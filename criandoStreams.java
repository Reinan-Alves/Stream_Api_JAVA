package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class criandoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// usando um consumer para colocar a referência do metodo print em uma variavél 
		Consumer<String> print = System.out::print;

		// criando stream 
		Stream<String> langs = Stream.of(" Java", " Lua", " Js\n");
		
		//utilizando o forEach para varrer  e o consumer para imprimir a stream criada
		langs.forEach(print);
		
		// criando um array pre definido
		String[] maisLangs = {" Python"," Lisp", "  Go\n"};
		
		//mais forma de utilizar o  stream
		Stream.of(maisLangs).forEach(print);
	
		Arrays.stream(maisLangs).forEach(print);
		
		//Imprimindo por index
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
		//Gerando Stream a partir das collections
		
		List<String> outrasLangs = Arrays.asList(" C", " PHP", " Kotlin\n");
		
		outrasLangs.stream().forEach(print);
		
		//em um Stream paralelo os dados não sao processados na ordem
		outrasLangs.parallelStream().forEach(print);
		
		//gera uma stream de forma infinita sem ordenação atraves passando um Supplier(função que não recebe parametro e retorna alguma coisa )
		//Stream.generate(() -> "...").forEach(print);
		
		//gera uma stream de forma infinita desta vez com ordenação
		//Stream.iterate(0, n -> n + 1).forEach(printInt);	
	}

}
