package aula20190618.threads_com_UI_refatorada;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class PainelDeThread extends JPanel {
	private JProgressBar progressBar = new JProgressBar();
	private JButton btnIniciar = new JButton("Iniciar");
	private JButton btnParar = new JButton("Parar");
	private JButton btnContinuar = new JButton("Continuar");
	private boolean suspended = false;
	private ThreadContadora t;
	/*
	private Thread t = new Thread(() -> {
		for (int i = 0; i <= 100; i++) {
			try {
				progressBar.setValue(i);
				Thread.sleep(500);
				revalidate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	*/
	
	public PainelDeThread() {
		this.t = new ThreadContadora(this.progressBar);
		this.btnParar.setEnabled(false);
		this.btnContinuar.setEnabled(false);
		this.btnIniciar.addActionListener(event -> {
			btnIniciar.setEnabled(false);
			btnParar.setEnabled(true);
			t.start();
		});
		this.btnParar.addActionListener(event -> {
			btnParar.setEnabled(false);
			btnContinuar.setEnabled(true);
			t.suspend();			
		});
		this.btnContinuar.addActionListener(event -> {
			btnParar.setEnabled(true);
			btnContinuar.setEnabled(false);
			t.resume();
		});

		this.setLayout(new GridLayout(1, 4));
		this.add(progressBar);
		this.add(btnIniciar);
		this.add(btnParar);
		this.add(btnContinuar);
	}
}
