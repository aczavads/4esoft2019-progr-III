package aula20191015.mutabilidade;

public class App {
	
	public static void main(String[] args) {
		
		Placar p = new Placar(0);
		
		Thread t1 = new Thread( () -> {
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < 1_000_000; i++) {
				p.marcar(1);
			}
			System.out.println(p.getPontos());
			long termino = System.currentTimeMillis();
			System.out.println("Tempo total: " + (termino-inicio));
		});
		Thread t2 = new Thread( () -> {
			long inicio = System.currentTimeMillis();
			for (int i = 0; i < 1_000_000; i++) {
				p.marcar(1);
			}
			System.out.println(p.getPontos());
			long termino = System.currentTimeMillis();
			System.out.println("Tempo total: " + (termino-inicio));
		});
		
		t2.start();
		t1.start();
		
		
	}

}
