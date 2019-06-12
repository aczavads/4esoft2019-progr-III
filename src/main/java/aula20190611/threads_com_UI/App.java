package aula20190611.threads_com_UI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;

public class App extends JDialog {
	private JButton btnAdicionar;
	
	
	public App() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setLayout(new GridLayout(10, 1));
		this.btnAdicionar = new JButton("+");
		this.btnAdicionar.addActionListener(event -> {
			add(new PainelDeThread());
			revalidate();
		});
		/*
		this.btnAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("Adicionando...");
				
			}
		});
		*/
		this.add(this.btnAdicionar);
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.setVisible(true);
	}

}
