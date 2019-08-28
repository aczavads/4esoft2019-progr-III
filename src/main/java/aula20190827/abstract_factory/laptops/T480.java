package aula20190827.abstract_factory.laptops;

public class T480 implements Laptop {

	@Override
	public void ligar() {
		System.out.println("T480 ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("T480 desligando...");
	}

	@Override
	public void processar() {
		System.out.println("T480 processando...");
	}

}
