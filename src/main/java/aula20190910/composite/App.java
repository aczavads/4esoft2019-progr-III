package aula20190910.composite;

import javax.swing.JOptionPane;

import aula20190910.observer.cofre.Cofre;
import aula20190910.observer.cofre.CofreListener;

public class App {
	
	public static void main(String[] args) {
		
		Cofre c1 = new Cofre("728b2");
		Cofre c2 = new Cofre("123x4");
		
		CofreListenerComposite composite = new CofreListenerComposite();
		composite.adicionarListener(new CofreListener() {
			@Override
			public void cofreFoiAberto(int senha, String numeroDeSerie) {
				JOptionPane.showMessageDialog(null, "O cofre " 
			           + numeroDeSerie 
			           + " foi aberto com a senha " 
			           + senha);
			}			
		});
		composite.adicionarListener(new CofreListener() {
			@Override
			public void cofreFoiAberto(int senha, String numeroDeSerie) {
				System.out.println("O cofre " 
			           + numeroDeSerie 
			           + " foi aberto com a senha " 
			           + senha);
			}			
		});

		
		c2.setListener(composite);
		
		c1.abrir(123456);
		c2.abrir(987135);
	}
}