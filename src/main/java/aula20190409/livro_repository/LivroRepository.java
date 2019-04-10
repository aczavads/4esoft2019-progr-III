package aula20190409.livro_repository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class LivroRepository implements Repository<Livro, String> {
	private final String ARQUIVO = "d:/repo/LivroRepository/dados.dat";
	private Set<Livro> dados = new HashSet<>();

	@Override
	public void add(Livro novo) {
		this.dados.add(novo);
	}

	@Override
	public Livro findById(String id) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO))) {
			dados = (HashSet<Livro>) in.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		for (Livro atual : dados) {
//			if (atual.getId().equals(id)) {
//				return atual;
//			}
//		}
//		return null;
		Predicate<Livro> predicado = new Predicate<Livro>() {
			@Override
			public boolean test(Livro atual) {				
				return atual.getId().equals(id);
			}
		}; 
		return dados
				.parallelStream()
				//.filter(actual -> actual.getId().equals(id))
				.filter(predicado)
				.findFirst()
				.orElseGet(null);
	}

	@Override
	public void flush() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
			out.writeObject(dados);
			dados.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
