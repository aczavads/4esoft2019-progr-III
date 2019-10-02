package aula20191001.injeção_de_dependências;

public class Logger {

	public void log(String what) {
		System.out.println(System.currentTimeMillis() + " " + what);
	}

}
