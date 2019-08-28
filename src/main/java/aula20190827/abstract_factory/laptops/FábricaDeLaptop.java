package aula20190827.abstract_factory.laptops;

public interface FábricaDeLaptop {
	
	Laptop fabricar();

	static FábricaDeLaptop obterFábrica(String tipo) {
		if (tipo.equals("chinesa")) {
			return new Lenovo();
		}
		return new Dell();
	}

}
