package streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "ana");

		// Formas de exibir a lista

		// tradicional for

		for (int i = 0; i < aprovados.size(); i++) {

			System.out.println(aprovados.get(i));

		}

		System.out.println("");
		// for each

		for (String aprovado : aprovados) {
			System.out.println(aprovado);
		}

		System.out.println("");

		// iterator

		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Stream
		Stream<String> stream = aprovados.stream();
		
		
		System.out.println("");
		stream.forEach(System.out::println);

	}

}
