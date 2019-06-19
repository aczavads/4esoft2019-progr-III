package aula20190618.threads_com_UI_refatorada2;

public class ThreadContadora extends Thread {
	private CallbackDeThreadContadora callback;
	private boolean suspensa;

	public ThreadContadora(CallbackDeThreadContadora callback) {
		this.callback = callback;
	}

	public void run() {
		for (int i = 0; i <= 100; i++) {
			try {

				synchronized (this) {
					while (suspensa) {
						wait();
					}
				}

				// progressBar.setValue(i);
				this.callback.notificar(i);
				Thread.sleep(500);
				// revalidate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void suspender() {
		this.suspensa = true;
	}

	public synchronized void continuar() {
		this.suspensa = false;
		this.notify();
	}

	/*
	public void continuar() {
		synchronized (this) {
			this.suspensa = false;
			this.notify();
		}
	}
	*/

}
