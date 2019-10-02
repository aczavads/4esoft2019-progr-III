package aula20191001.inje��o_de_depend�ncias;

public class DepositoController {	
	private DepositoService service = new DepositoService();
	
	@InjetePorFavor
	private Logger logger; 

	
	public void criarNovo(String deposito) {
		logger.log("{before} [controller] criar novo.");
		//service.processar(deposito);
		logger.log("{after} [controller] criar novo.");
	}

}
