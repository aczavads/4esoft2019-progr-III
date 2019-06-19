package aula20190618.threads_com_UI_refatorada;

import javax.swing.JProgressBar;

public class ThreadContadora extends Thread {
	private JProgressBar progressBar = null;

	public ThreadContadora(JProgressBar progressBar) {
		this.progressBar = progressBar;
	}
	
	public void run() {
		for (int i = 0; i <= 100; i++) {
			try {
				progressBar.setValue(i);
				Thread.sleep(500);
				//revalidate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


}
