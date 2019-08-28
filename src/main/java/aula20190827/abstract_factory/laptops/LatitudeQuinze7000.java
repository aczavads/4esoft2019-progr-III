package aula20190827.abstract_factory.laptops;

public class LatitudeQuinze7000 implements Laptop {

	@Override
	public void ligar() {
		System.out.println("Latitude ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("Latitude desligando...");
	}

	@Override
	public void processar() {
		System.out.println("Latitude processando...");
	}

}
