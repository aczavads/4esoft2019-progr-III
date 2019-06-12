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
	
	
	public PainelDeThread() {
		this.setLayout(new GridLayout(1, 4));
		//progressBar.setValue((int)System.currentTimeMillis()%100);
		this.add(progressBar);
		this.add(btnIniciar);
		//this.add(btnParar);
		//this.add(btnContinuar);
	}

}
