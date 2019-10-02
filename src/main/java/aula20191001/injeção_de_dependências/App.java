package aula20191001.inje��o_de_depend�ncias;

public class App {
	
	public static void main(String[] args) {
		EsoftInjectorPlus injectorPlus = new EsoftInjectorPlus();
		injectorPlus.registerDependency(new Logger());
		
		DepositoController controller = injectorPlus.create(DepositoController.class);		
		controller.criarNovo("teste");
		
	}

}
