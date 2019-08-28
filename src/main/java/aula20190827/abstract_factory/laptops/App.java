package aula20190827.abstract_factory.laptops;

public class App {
	
	public static void main(String[] args) {
		
		FábricaDeLaptop dell = FábricaDeLaptop.obterFábrica("");
		Laptop laptop = dell.fabricar();
		
		laptop.ligar();
		laptop.desligar();
		System.out.println(laptop.getClass());
	}

}
