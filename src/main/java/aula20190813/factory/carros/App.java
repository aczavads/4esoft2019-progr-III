package aula20190813.factory.carros;

public class App {
	
	public static void main(String[] args) {
		Carro carro = GM.fabricarCarro(Categoria.HATCH);
		
		System.out.println(carro + ": " + carro.getDescricao());
	}

}
