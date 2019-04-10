package aula20190409.livro_repository;

import java.io.Serializable;

public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String titulo;
	
	public Livro(String id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}
	
	public String getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
