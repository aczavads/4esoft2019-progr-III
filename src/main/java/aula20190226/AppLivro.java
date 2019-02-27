package aula20190226;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppLivro {
	
	public static void main(String[] args) throws Exception {
		Livro novo = new Livro("Python for Data Science", 2999);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/livro.data"));
		//ObjectOutputStream oos = new ObjectOutputStream(System.out);
		oos.writeObject(novo);
		oos.close();
			
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/livro.data"));
		Livro recuperado = (Livro)ois.readObject();
		
		System.out.println(recuperado.toString());
		
	}

	
	
}
