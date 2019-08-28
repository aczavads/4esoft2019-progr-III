package aula20190827.abstract_factory.laptops;

public class App {
	
	public static void main(String[] args) {
		
		F�bricaDeLaptop dell = F�bricaDeLaptop.obterF�brica("");
		Laptop laptop = dell.fabricar();
		
		laptop.ligar();
		laptop.desligar();
		System.out.println(laptop.getClass());
	}

}
