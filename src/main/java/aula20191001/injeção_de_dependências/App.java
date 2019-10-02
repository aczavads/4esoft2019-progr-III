package aula20191001.injeção_de_dependências;

public class App {
	
	public static void main(String[] args) {
		EsoftInjectorPlus injectorPlus = new EsoftInjectorPlus();
		injectorPlus.registerDependency(new Logger());
		
		DepositoController controller = injectorPlus.create(DepositoController.class);		
		controller.criarNovo("teste");
		
	}

}
