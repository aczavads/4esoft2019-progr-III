package aula20190813.factory.carros;

public abstract class GM {

	public static Carro fabricarCarro(Categoria categoria) {
		switch (categoria) {
		case HATCH:
			return new Onix();
		case SEDAN:
			return new Cruze();
		case SUV:
			return new Tracker();
		default:
			break;
		}
		return null;
	}

}
