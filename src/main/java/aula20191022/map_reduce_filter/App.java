package aula20191022.map_reduce_filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	
	public static void main(String[] args) {
		
		Integer[] idades = {10,15,15,55,80,10,25,30,35,80,77,90,99,1,2,7,3,33,90,30,25,10};
		Stream.of(idades).parallel()
			.filter( e -> e%2 == 0)
			.map( e -> e*2 )
			//.sorted( (v1,v2) -> v1.compareTo(v2) ) ?????? :D
			.forEach( e -> System.out.println(e));
			//.forEach( e -> System.out.println(e));		

		Integer total = Stream.of(idades).reduce( (acc, element) -> acc+element ).get();
		System.out.println(total);
		
		Integer maior = Stream.of(idades)
				.filter( element -> element%2==0)
				.reduce( (max, element) -> element > max ? element : max )
				.get();
		
		System.out.println(maior);
		
		Integer menor = Stream.of(idades).reduce( (min, element) -> element < min ? element : min ).get();
		System.out.println(menor);
		
		String[] idadesAsString = {"10","15","15","55","80","10","25","30","35","80","77","90","99","1","2","7","3","33","90","30","25","10"};
		total = Stream.of(idadesAsString).map( element -> Integer.parseInt(element)).reduce( (acc, element) -> acc+element ).get();
		System.out.println(total);
		
		List<Pessoa> pessoas = Arrays.asList(new Pessoa(10), new Pessoa(30), new Pessoa(70), new Pessoa(19), new Pessoa(20));
		Integer menorIdade = pessoas.stream()
				.map( p -> p.getIdade() )
				.filter( element -> element%2==1)
				.reduce( (min, element) -> element < min ? element : min )
				.get();
		System.out.println(menorIdade);
		
		Optional<Pessoa> p = getPessoa();
		//p.orElseThrow( () -> new RuntimeException(""));
		System.out.println(p.orElseGet(() -> new Pessoa(0)).getIdade());
		
	}
	
	private static Optional<Pessoa> getPessoa() {
		if (System.currentTimeMillis()%2 == 0) {
			return Optional.empty();
		} else {
			return Optional.of(new Pessoa(55));
		}
	}

}
