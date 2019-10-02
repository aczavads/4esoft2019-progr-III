package aula20191001.injeção_de_dependências;

public class DepositoService {
	
	@InjetePorFavor
	private Logger logger;

	public void processar(String deposito) {
		logger.log("{before} [service] processar.");
		System.out.println("[service] processando: " + deposito);
		logger.log("{after} [service] processar.");		
	}

}
