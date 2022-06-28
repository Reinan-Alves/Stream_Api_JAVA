package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
	
		/*criar lista de valores inteiros
		 * povoar com numeros inteiros de 1 a 9
		 * numero para string binaria  ... 6 => "110"
		 * reverter a string ..."110" = "011"
		 * converter de volta para inteiro(decimal) => "011" => 3
		 * Dica: Pesquisar sobre metodos do tipo Integer;
		 * */
		
		Consumer<Integer> print = System.out::println;
		Consumer<String> printS = System.out::println;
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//convertendo de numero para binario string
		Function<Integer, String> binaryString = n -> Integer.toBinaryString(n);
		
		//invertendo a string
		UnaryOperator<String> stringReverse = s -> new StringBuilder(s).reverse().toString();
		
		//Retornando a conversão para inteiro(decimal)
		Function<String, Integer> reConvertInt = s -> Integer.parseInt(s, 2);
		
		System.out.println("Binarios: ");
		numbers.stream().map(binaryString).forEach(printS);
		
		System.out.println("Binarios invertidos: ");
		numbers.stream().map(binaryString).map(stringReverse).forEach(printS);
		
		System.out.println("Binarios invertidos convertidos: ");
		numbers.stream().map(binaryString).map(stringReverse).map(reConvertInt).forEach(print);
		
		//nota: para converter um numero inteiro para binary string usando uma stream podemos reduzir o código usando  stream().map(Integer::toBinaryString) 
		
		
		
	}

}
