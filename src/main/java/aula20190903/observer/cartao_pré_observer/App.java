package aula20190903.observer.cartao_pr�_observer;

public class App {
	
	public static void main(String[] args) {
		Cart�oDeCr�dito daEsposa = new Cart�oDeCr�dito();
		Cart�oDeCr�dito meu = new Cart�oDeCr�dito();
		
		meu.comprar(159.99);
		meu.comprar(159.99);
		meu.comprar(159.99);
		meu.comprar(39.99);
		meu.comprar(39.99);
		
		daEsposa.ativarNotifica��o();
		daEsposa.comprar(158.99);
		daEsposa.comprar(222.99);
		daEsposa.comprar(99.99);
		daEsposa.comprar(99.99);
		daEsposa.comprar(99.99);
		daEsposa.desativarNotifica��o();
		daEsposa.comprar(79.99);
		
		System.out.println("Fim.]");
	}

}
