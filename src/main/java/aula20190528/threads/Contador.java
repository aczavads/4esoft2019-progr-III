package aula20190528.threads;

import java.util.UUID;

public class Contador extends Thread {
	private int limite;

	public Contador(int limite) {
		this.limite = limite;
	}

	@Override
	public void run() {
		for (int i = 0; i < limite; i++) {
			System.out.println(this + " ==> " + i );
			try {
				for (int j = 0; j < 1_000_000; j++) {
					String uuid = UUID.randomUUID().toString();
				}
				//this.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
