package aula20191015.mutabilidade;

public class Placar {
	private int pontos;

	public Placar(int pontos) {
		this.pontos = pontos;
	}
	
	public synchronized void marcar(int pontos) {
		this.pontos += pontos;
	}
	
	public int getPontos() {
		return pontos;
	}

}
