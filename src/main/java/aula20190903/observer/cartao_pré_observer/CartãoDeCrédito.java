package aula20190903.observer.cartao_pr�_observer;

public class Cart�oDeCr�dito {
	private double totalDeD�bitos;
	private boolean notificar = false;

	public void comprar(double valor) {
		if (notificar) {
			System.out.println("Compra efetuada: " + valor);
		}
		this.totalDeD�bitos += valor;
	}

	public void ativarNotifica��o() {
		this.notificar = true;
	}
	
	public void desativarNotifica��o() {
		this.notificar = false;
	}

}
