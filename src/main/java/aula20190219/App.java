package aula20190219;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class App {
	public static void main(String[] args) throws Exception {
		long inicio = System.currentTimeMillis();
		OutputStream out =  new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("d:\\muitos.txt.gz")));
		for (int linha = 1; linha < 100000000; linha++) {
			out.write("Olá mundo!\n".getBytes());
		}
		out.close();
		System.out.println("Tempo total: " + (System.currentTimeMillis()-inicio));
		
	}
	/*
	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("d:\\copia.png");
		FileInputStream in = new FileInputStream("d:\\logo.png");
		int dado = in.read();
		while (dado != -1) {
			out.write(dado);
			dado = in.read();
		}
		out.close();
		in.close();
		System.out.println("Foi.");
	}
	*/

}
