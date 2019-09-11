package aula20190910.observer.cofre;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
		Cofre c1 = new Cofre("728b2");
		Cofre c2 = new Cofre("123x4");
		
		c2.setListener(new CofreListener() {
			@Override
			public void cofreFoiAberto(int senha, String numeroDeSerie) {
				JOptionPane.showMessageDialog(null, "O cofre " 
			           + numeroDeSerie 
			           + " foi aberto com a senha " 
			           + senha);
			}			
		});
		
		c1.abrir(123456);
		c2.abrir(987135);
	}
}