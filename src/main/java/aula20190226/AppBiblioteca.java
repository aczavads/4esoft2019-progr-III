package aula20190226;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class AppBiblioteca {
	
	public static void main(String[] args) throws Exception {
		Biblioteca uniCesumar = new Biblioteca();
		for (int i = 0; i < 1000; i++) {
			uniCesumar.adicionarLivro(new Livro("Livro " + i, i));
		}
		
		ObjectOutputStream out = new ObjectOutputStream(new GZIPOutputStream(new FileOutputStream("d:/biblioteca.data")));
		out.writeObject(uniCesumar);
		out.close();
		
		
		ObjectInputStream input = new ObjectInputStream(new GZIPInputStream(new FileInputStream("d:/biblioteca.data")));
		Biblioteca recuperada = (Biblioteca) input.readObject();
		System.out.println(recuperada.getTamanhoDoAcervo());
	}

}
