package aula20190528.threads;

public class App {
	
	
	public static void main(String[] args) {
		Runnable c0 = () -> {
			for (int i = 0; i < 1_000_000; i++) {
				System.out.println("runnable => " + i);
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}
			}
		};
		/*
		Runnable c0 = new Runnable() {			
			@Override
			public void run() {
				for (int i = 0; i < 1_000_000; i++) {
					System.out.println("runnable => " + i);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		};
		*/
		
		Contador c1 = new Contador(1000);
		Contador c2 = new Contador(1000);
		Contador c3 = new Contador(1000);
		Contador c4 = new Contador(1000);
		Contador c5 = new Contador(1000);
		Contador c6 = new Contador(1000);
		(new Thread(c0)).start();
		c1.start();		
		c2.start();		
		c3.start();		
		c4.start();		
		c5.start();		
		c6.start();		
		System.out.println("Foi");
	}

}
