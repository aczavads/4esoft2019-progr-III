package aula20191015.functional_style;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		JDialog tela = new JDialog();
		tela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		tela.setSize(300,200);
		tela.setVisible(true);
		final JButton clickMe = new JButton("Click me!");

		/*
		clickMe.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Opa!");				
			}			
		});
		*/
		
		//syntactic sugar
		String nome = "Fulana";
		clickMe.addActionListener( (event) -> {
			JOptionPane.showMessageDialog(null, "Opa " + nome + "!" );
		});
		
		UnaryOperator<Integer> funssaum = (v1) -> v1 + 10;
		System.out.println(funssaum.apply(300));
		System.out.println(funssaum.apply(30));
		
		tela.add(clickMe);
		
		String[] nomes = {"Ana", "Beatriz", "Josias", " Bernadete ", " Ladislau   ", "    Glaasdfucia "};
		
		Integer soma = Stream.of(nomes)
				.map( s -> s.trim() )
				.mapToInt(s -> s.length())
				.sum();
		System.out.println(soma);
		
		Optional<String> optional = (Optional<String>) Optional.ofNullable(null).orElse("");
		
		System.out.println( optional.get().toUpperCase() );
		
		
		
	}

}
