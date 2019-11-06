package aula20191105.inje��o_de_depend�ncias;

public class Logger implements ILogger {
	private static Logger instance = new Logger();

	public static Logger getInstance() {
		return instance;
	}

	public void log(String message) {
		System.out.println("[LOGGING] " + message);
	}

}
