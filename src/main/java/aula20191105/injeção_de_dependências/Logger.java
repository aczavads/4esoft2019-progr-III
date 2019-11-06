package aula20191105.injeção_de_dependências;

public class Logger implements ILogger {
	private static Logger instance = new Logger();

	public static Logger getInstance() {
		return instance;
	}

	public void log(String message) {
		System.out.println("[LOGGING] " + message);
	}

}
