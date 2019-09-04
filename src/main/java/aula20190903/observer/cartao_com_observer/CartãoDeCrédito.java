package aula20190903.observer.cartao_com_observer;

public class CartãoDeCrédito {
	private double totalDeDébitos;
	private CompraEfetuadaListener listener;

	public void comprar(double valor) {
		if (listener != null) {
			listener.notificar(valor);
		}
		this.totalDeDébitos += valor;
	}

	public void ativarNotificação(CompraEfetuadaListener listener) {
		this.listener = listener;
	}
	
	public void desativarNotificação() {
		this.listener = null;
	}

}
