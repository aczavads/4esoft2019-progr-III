package aula20190813.factory;

public class App {
	

	public static void main(String[] args) {
		Confeito confeito = Hachimitsu.criarConfeito(Sabor.ACIDO);
		
		System.out.println(confeito + ": " + confeito.getSabor());
	}

}
