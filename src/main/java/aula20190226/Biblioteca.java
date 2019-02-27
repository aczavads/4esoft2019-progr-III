package aula20190226;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Serializable {
	private List<Livro> acervo = new ArrayList();
	
	public void adicionarLivro(Livro livro) {
		this.acervo.add(livro);
	}
	
	public int getTamanhoDoAcervo() {
		return this.acervo == null ? 0 : this.acervo.size();
	}
}
