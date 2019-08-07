package aula20190806.singleton;

public class ConnectionPooling {	
	private static ConnectionPooling instance;
	private int timeout = 0;

	private ConnectionPooling() {
	}
	
	public static ConnectionPooling getInstance() {
		if (instance == null) {
			instance = new ConnectionPooling();
		}
		return instance;
	}
	
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	
	public void close() {
		System.out.println("Fechando o connection pooling...");
	}
	public int getTimeout() {
		return timeout;
	}
}
