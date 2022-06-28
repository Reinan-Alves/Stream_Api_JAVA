package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		/*
		 * execultando direto alunos.stream().filter(a -> a.nota >= 7.0).map(a -> a.nome
		 * + ": Aprovado").forEach(System.out::println);
		 */

		// refatorando
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> exibeAprovado = a -> "Você foi aprovado(a)" + a.nome + ", PARABÉNS!! ";

		alunos.stream().filter(aprovado).map(exibeAprovado).forEach(System.out::println);
	}

}
