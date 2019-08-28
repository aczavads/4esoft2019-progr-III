package aula20190827.builder;

public class App {
	
	public static void main(String[] args) {
		/*
		Bolo nosso = new Bolo(Cobertura.GLAC�, Recheio.MORANGOS, Massa.BRANCA, Decora��o.CL�SSICA);
		Bolo nosso = new Bolo(Cobertura.GLAC�);
		Bolo nosso = new Bolo(Recheio.MORANGOS);
		Bolo nosso = new Bolo(Cobertura.GLAC�, Recheio.MORANGOS);
		Bolo nosso = new Bolo(Cobertura.GLAC�, Recheio.MORANGOS, Massa.BRANCA);
		Bolo nosso = new Bolo(Recheio.MORANGOS, Massa.BRANCA, Decora��o.CL�SSICA);
		Bolo nosso = new Bolo(Massa.BRANCA, Decora��o.CL�SSICA);
		Bolo nosso = new Bolo(Decora��o.CL�SSICA);
		*/
		Bolo nosso = Bolo.builder()
				.decora��o(Decora��o.CL�SSICA)
				.massa(Massa.BRANCA)
				.build();
		
		System.out.println(nosso.getDecora��o());
		System.out.println(nosso.getMassa());



		Pessoa p = new Pessoa();
		p.setNome("fulano").setSobrenome("Almeida").setIdade(21);
		
		
	}

}
