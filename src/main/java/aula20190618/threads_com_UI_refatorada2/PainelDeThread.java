package aula20190618.threads_com_UI_refatorada2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class PainelDeThread extends JPanel {
	private JProgressBar progressBar = new JProgressBar();
	private JTextField tfProgress = new JTextField();
	private JButton btnIniciar = new JButton("Iniciar");
	private JButton btnParar = new JButton("Parar");
	private JButton btnContinuar = new JButton("Continuar");
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
		this.t = new ThreadContadora(new CallbackDeThreadContadora() {			
			@Override
			public void notificar(int valorAtual) {
				System.out.println("Callback invocado!  :P");
				progressBar.setValue(valorAtual);
				tfProgress.setText(valorAtual+"");
			}
		});
		
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
			//t.suspend();
			t.suspender();
		});
		this.btnContinuar.addActionListener(event -> {
			btnParar.setEnabled(true);
			btnContinuar.setEnabled(false);
			t.continuar();
		});

		this.tfProgress.setEnabled(false);
		this.setLayout(new GridLayout(1, 5));
		this.add(progressBar);
		this.add(tfProgress);
		this.add(btnIniciar);
		this.add(btnParar);
		this.add(btnContinuar);
	}
}
