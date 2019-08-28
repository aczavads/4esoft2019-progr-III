package aula20190827.builder;

public class App {
	
	public static void main(String[] args) {
		/*
		Bolo nosso = new Bolo(Cobertura.GLACÊ, Recheio.MORANGOS, Massa.BRANCA, Decoração.CLÁSSICA);
		Bolo nosso = new Bolo(Cobertura.GLACÊ);
		Bolo nosso = new Bolo(Recheio.MORANGOS);
		Bolo nosso = new Bolo(Cobertura.GLACÊ, Recheio.MORANGOS);
		Bolo nosso = new Bolo(Cobertura.GLACÊ, Recheio.MORANGOS, Massa.BRANCA);
		Bolo nosso = new Bolo(Recheio.MORANGOS, Massa.BRANCA, Decoração.CLÁSSICA);
		Bolo nosso = new Bolo(Massa.BRANCA, Decoração.CLÁSSICA);
		Bolo nosso = new Bolo(Decoração.CLÁSSICA);
		*/
		Bolo nosso = Bolo.builder()
				.decoração(Decoração.CLÁSSICA)
				.massa(Massa.BRANCA)
				.build();
		
		System.out.println(nosso.getDecoração());
		System.out.println(nosso.getMassa());



		Pessoa p = new Pessoa();
		p.setNome("fulano").setSobrenome("Almeida").setIdade(21);
		
		
	}

}
