package streamApi;

import java.util.function.UnaryOperator;

public class Utilitarios {

	// Operador unario para receber maiusculo
	public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();

	// Operador unario para receber a primeira Letra, obs: foi concatenada a um
	// astring vazia por causa do retorno
	public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

	// concatena com !!!
	public static final String grito(String n) {
		return n + "!!! ";
	}

}
