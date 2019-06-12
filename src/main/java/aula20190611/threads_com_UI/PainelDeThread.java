package aula20190611.threads_com_UI;

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

	public PainelDeThread() {
		this.btnIniciar.addActionListener(event -> {
			btnIniciar.setEnabled(false);
			t.start();
		});
		this.btnParar.addActionListener(event -> {
			t.suspend();
		});
		this.btnContinuar.addActionListener(event -> {
			t.resume();
		});

		this.setLayout(new GridLayout(1, 4));
		this.add(progressBar);
		this.add(btnIniciar);
		this.add(btnParar);
		this.add(btnContinuar);
	}
}
