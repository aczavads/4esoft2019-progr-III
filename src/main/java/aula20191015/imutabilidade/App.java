package aula20191015.imutabilidade;

import java.math.BigDecimal;

public class App {
	
	public static void main(String[] args) {
		PlacarImutavel p = new PlacarImutavel(0);
		
		System.out.println(p + " ==> " + p.getPontos());
		
		p = p.marcar(1).marcar(1).marcar(1).marcar(1).marcar(1).marcar(1).marcar(1).marcar(1).marcar(1);
						
		System.out.println(p + " ==> " + p.getPontos());
		
		String s = "     Quarto ano, formandos!!!! ";
		s = s.toUpperCase().trim().replaceAll("!!!!", "?? :D ");
		System.out.println(s);
		
		BigDecimal salarioDeProfessor = new BigDecimal("15000.00");
		salarioDeProfessor = salarioDeProfessor.add(new BigDecimal("1000.00"));
		System.out.println(salarioDeProfessor);
	}

}
