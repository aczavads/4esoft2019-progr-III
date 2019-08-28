package aula20190827.abstract_factory.laptops;

public class Lenovo implements FábricaDeLaptop {

	@Override
	public Laptop fabricar() {
		return new T480();
	}

}
