package aula20191001.proxy_dinâmico;

public class Produto {

	private Long id;

	public Produto(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + "]";
	}
	
	


}
