package aula20190903.observer.cartao_com_observer;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		CartãoDeCrédito daEsposa = new CartãoDeCrédito();
		CartãoDeCrédito meu = new CartãoDeCrédito();
		
		meu.comprar(159.99);
		meu.comprar(159.99);
		meu.comprar(159.99);
		meu.comprar(39.99);
		meu.comprar(39.99);
		
		daEsposa.ativarNotificação(new CompraEfetuadaListener() {
			@Override
			public void notificar(double valorDaCompra) {
				JOptionPane.showMessageDialog(null, "Ulha, comprou! Valor: " + valorDaCompra);
			}			
		});
		daEsposa.ativarNotificação(new CompraEfetuadaListener() {
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
		daEsposa.desativarNotificação();
		daEsposa.comprar(79.99);
		
		System.out.println("Fim.");
	}

}
