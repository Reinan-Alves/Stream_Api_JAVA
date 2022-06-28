package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter01 {

	public static void main(String[] args) {

		/*
		 * O desafio consiste em usar a criatividade para representar algo real de sua
		 * utilidade e dentro dela: riar alguma classe com seus atributos; Criar pelo
		 * menos duas funções labdas para fazer Criar pelo menos dois filtros Criar pelo
		 * menos um map
		 */

		// instaciando os cursos da Classe curso:

		Curso c1 = new Curso("capgemini", 2.5, 100, true);
		Curso c2 = new Curso("Dio", 2.0, 90, false);
		Curso c3 = new Curso("Alura", 3.5, 100, true);
		Curso c4 = new Curso("Udemy", 2.5, 120, false);
		Curso c5 = new Curso("SoulCode", 1.0, 100, true);
		Curso c6 = new Curso("Unit", 2.0, 90, true);
		Curso c7 = new Curso("IGTI", 2.5, 90, false);

		List<Curso> listaCursos = Arrays.asList(c1, c2, c3, c4, c5, c6, c7);
		Consumer<String> println = System.out::println;

		Predicate<Curso> cursoBom = c -> c.avaliacao >= 2.5 && c.duracao >= 40 && c.recomendado == true;
		Predicate<Curso> cursoMedioBom = c -> c.avaliacao >= 2.5 && c.duracao >= 40 && c.recomendado == false;
		Predicate<Curso> cursoMedioRuim = c -> (c.avaliacao < 2.5 || c.duracao < 40) && c.recomendado == true;
		Predicate<Curso> cursoRuim = c -> (c.avaliacao < 2.5 || c.duracao < 40) && c.recomendado == false;
		Function<Curso, String> feedBackBom = c -> "O Curso " + c.nome + " foi considerado bom";
		Function<Curso, String> feedBackMedioBom = c -> "O Curso " + c.nome + " foi considerado entre Medio e bom";
		Function<Curso, String> feedBackMedioRuim = c -> "O Curso " + c.nome + " foi considerado entre ruim e Medio";
		Function<Curso, String> feedBackRuim = c -> "O Curso " + c.nome + " foi considerado Ruim";
		
		
		listaCursos.stream().filter(cursoRuim).map(feedBackRuim).forEach(println);
		listaCursos.stream().filter(cursoMedioBom).map(feedBackMedioBom).forEach(println);
		listaCursos.stream().filter(cursoMedioRuim).map(feedBackMedioRuim).forEach(println);
		listaCursos.stream().filter(cursoBom).map(feedBackBom).forEach(println);
		

	}

}
