package aula20190903.observer.cartao_com_observer;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		Cart�oDeCr�dito daEsposa = new Cart�oDeCr�dito();
		Cart�oDeCr�dito meu = new Cart�oDeCr�dito();
		
		meu.comprar(159.99);
		meu.comprar(159.99);
		meu.comprar(159.99);
		meu.comprar(39.99);
		meu.comprar(39.99);
		
		daEsposa.ativarNotifica��o(new CompraEfetuadaListener() {
			@Override
			public void notificar(double valorDaCompra) {
				JOptionPane.showMessageDialog(null, "Ulha, comprou! Valor: " + valorDaCompra);
			}			
		});
		daEsposa.ativarNotifica��o(new CompraEfetuadaListener() {
			@Override
			public void notificar(double valorDaCompra) {
				System.out.println("Ulha, comprou! Valor: " + valorDaCompra);
			}			
		});
		daEsposa.comprar(158.99);
		daEsposa.comprar(222.99);
		daEsposa.comprar(99.99);
		daEsposa.comprar(99.99);
		daEsposa.comprar(99.99);
		daEsposa.desativarNotifica��o();
		daEsposa.comprar(79.99);
		
		System.out.println("Fim.");
	}

}
