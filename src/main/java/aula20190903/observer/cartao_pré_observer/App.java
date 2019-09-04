package aula20190903.observer.cartao_pré_observer;

public class App {
	
	public static void main(String[] args) {
		CartãoDeCrédito daEsposa = new CartãoDeCrédito();
		CartãoDeCrédito meu = new CartãoDeCrédito();
		
		meu.comprar(159.99);
		meu.comprar(159.99);
		meu.comprar(159.99);
		meu.comprar(39.99);
		meu.comprar(39.99);
		
		daEsposa.ativarNotificação();
		daEsposa.comprar(158.99);
		daEsposa.comprar(222.99);
		daEsposa.comprar(99.99);
		daEsposa.comprar(99.99);
		daEsposa.comprar(99.99);
		daEsposa.desativarNotificação();
		daEsposa.comprar(79.99);
		
		System.out.println("Fim.]");
	}

}
