package aula20190903.observer.cartao_com_observer;

public class Cart�oDeCr�dito {
	private double totalDeD�bitos;
	private CompraEfetuadaListener listener;

	public void comprar(double valor) {
		if (listener != null) {
			listener.notificar(valor);
		}
		this.totalDeD�bitos += valor;
	}

	public void ativarNotifica��o(CompraEfetuadaListener listener) {
		this.listener = listener;
	}
	
	public void desativarNotifica��o() {
		this.listener = null;
	}

}
