package aula20191105.injeção_de_dependências;

public class Calculadora {
	private ILogger logger;
	
	public Calculadora(ILogger logger) {
		this.logger = logger;
	}

	public double somar(double v1, double v2) {
		logger.log("Vai somar...");
		double resultado = v1+v2;
		logger.log("Somou!");
		return resultado;
	}

}
