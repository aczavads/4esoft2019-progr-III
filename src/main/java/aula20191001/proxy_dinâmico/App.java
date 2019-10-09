package aula20191001.proxy_dinâmico;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		ProdutoRepository repo = (ProdutoRepository) RepositoryProxy.criarProxy(ProdutoRepository.class);
		System.out.println(repo.getClass());
		repo.save(new Produto(1L));
		repo.findById(999L);
		
		
		
		List<String> nomes = (List<String>)ArrayListProxyDinâmico.create(new ArrayList<>());
		nomes.add("Márcia");
		nomes.add("Luciano");
		nomes.add("Robson");
		nomes.add("Alberta");
		nomes.add("Robson");
		nomes.add("Alberta");
		
		tratarNomes(nomes);
		
		System.out.println(nomes.size());
		//System.out.println(((ArrayListProxy)nomes).getContador());
		//System.out.println(((ArrayListProxyDinâmico)nomes).getContador());
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		
		
		
		
	}

	private static void tratarNomes(List<String> nomes) {
		nomes.remove(0);
		nomes.remove(1);
		nomes.remove("Alberta");
	}

}
