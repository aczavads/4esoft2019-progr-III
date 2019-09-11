package aula20190910.observer.cofre;

public class Cofre {

	private String numeroDeSerie;
	private CofreListener listener;

	public Cofre(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public void setListener(CofreListener listener) {
		this.listener = listener;
		
	}

	public void abrir(int senha) {
		if (listener != null) {
			listener.cofreFoiAberto(senha, numeroDeSerie);
		}
		//....
	}

}
