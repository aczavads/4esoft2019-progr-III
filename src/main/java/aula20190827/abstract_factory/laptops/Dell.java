package aula20190827.abstract_factory.laptops;

public class Dell implements FábricaDeLaptop {

	@Override
	public Laptop fabricar() {
		return new LatitudeQuinze7000();
	}

}
