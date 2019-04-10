package aula20190409.livro_repository_multi_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LivroRepository implements Repository<Livro, String> {
	private static final String PASTA = "d:/repo/LivroRepository/";
	private static final String ARQUIVO = "dados";
	private static final String EXTENSAO_ARQUIVO = ".dat";
	private static final int REGISTROS_POR_ARQUIVO = 1000;
	private Set<Livro> dados = new HashSet<>();

	@Override
	public void flush() {
		String[] nomesDosArquivos = definirNomesDosArquivos();
		
		int arquivoAtual = 0;
		int quantidade = 0;
		Set<Livro> conjuntoAuxiliar = new HashSet<>();
		for (Livro atual : dados) {
			quantidade++;
			conjuntoAuxiliar.add(atual);
			if (quantidade == REGISTROS_POR_ARQUIVO) {
				gravarArquivo(nomesDosArquivos[arquivoAtual], conjuntoAuxiliar);
				quantidade = 0;
				arquivoAtual++;
				conjuntoAuxiliar.clear();
			}
		}
		if (quantidade > 0) {
			gravarArquivo(nomesDosArquivos[arquivoAtual++], conjuntoAuxiliar);
		}
		
	}

	private void gravarArquivo(String nomeDoArquivo, Set<Livro> conjunto) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo))) {
			out.writeObject(conjunto);
			conjunto.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String[] definirNomesDosArquivos() {
		// 2.03 ==> 3
		int quantidadeDeArquivos = new BigDecimal((float) this.dados.size() / REGISTROS_POR_ARQUIVO).setScale(0,
				BigDecimal.ROUND_UP).intValue();
		String[] arquivos = new String[quantidadeDeArquivos];
		for (int i = 0; i < quantidadeDeArquivos; i++) {
			arquivos[i] = PASTA + ARQUIVO + i + EXTENSAO_ARQUIVO;
		}
		return arquivos;
	}

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
		Predicate<Livro> predicado = new Predicate<Livro>() {
			@Override
			public boolean test(Livro atual) {
				return atual.getId().equals(id);
			}
		};
		return dados.parallelStream()
				// .filter(actual -> actual.getId().equals(id))
				.filter(predicado).findFirst().orElseGet(null);
	}

}
