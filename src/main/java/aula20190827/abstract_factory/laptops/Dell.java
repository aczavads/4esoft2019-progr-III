package aula20190827.abstract_factory.laptops;

public class Dell implements F�bricaDeLaptop {

	@Override
	public Laptop fabricar() {
		return new LatitudeQuinze7000();
	}

}
