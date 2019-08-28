package aula20190827.abstract_factory.laptops;

public interface F�bricaDeLaptop {
	
	Laptop fabricar();

	static F�bricaDeLaptop obterF�brica(String tipo) {
		if (tipo.equals("chinesa")) {
			return new Lenovo();
		}
		return new Dell();
	}

}
