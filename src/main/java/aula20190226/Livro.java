package aula20190226;

import java.io.Serializable;

public class Livro implements Serializable {
	private static final long serialVersionUID = -5414153633341479824L;
	private String titulo;
	private int quantidadeDePaginas;
	private boolean descontinuado;

	public Livro(String titulo, int quantidadeDePaginas) {
		this.titulo = titulo;
		this.quantidadeDePaginas = quantidadeDePaginas;

	}
	public String getTitulo() {
		return titulo;
	}

	public int getQuantidadeDePaginas() {
		return quantidadeDePaginas;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", quantidadeDePaginas=" + quantidadeDePaginas + ", descontinuado="
				+ descontinuado + "]";
	}

	
	

}
