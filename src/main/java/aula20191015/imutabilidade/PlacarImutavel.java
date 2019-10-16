package aula20191015.imutabilidade;

public class PlacarImutavel {
	private final int pontos;

	public PlacarImutavel(int pontos) {
		this.pontos = pontos;
	}
	
	public PlacarImutavel marcar(int pontos) {
		return new PlacarImutavel(this.pontos + pontos);
	}
	
	public int getPontos() {
		return pontos;
	}
	
	
	
	

}
