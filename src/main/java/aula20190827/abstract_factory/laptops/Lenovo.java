package aula20190827.abstract_factory.laptops;

public class Lenovo implements F�bricaDeLaptop {

	@Override
	public Laptop fabricar() {
		return new T480();
	}

}
