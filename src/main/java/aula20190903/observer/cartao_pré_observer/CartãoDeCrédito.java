package aula20190903.observer.cartao_pré_observer;

public class CartãoDeCrédito {
	private double totalDeDébitos;
	private boolean notificar = false;

	public void comprar(double valor) {
		if (notificar) {
			System.out.println("Compra efetuada: " + valor);
		}
		this.totalDeDébitos += valor;
	}

	public void ativarNotificação() {
		this.notificar = true;
	}
	
	public void desativarNotificação() {
		this.notificar = false;
	}

}
