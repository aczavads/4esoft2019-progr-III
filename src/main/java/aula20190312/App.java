package aula20190312;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class App {

	private static final String FILE_NAME = "d://alunos.dat";

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Ana Maria", 21));
		alunos.add(new Aluno("Joana", 20));
		alunos.add(new Aluno("Josias", 21));
		alunos.add(new Aluno("Josué", 21));
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			out.writeObject(alunos);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			List<Aluno> recuperados = (List<Aluno>) in.readObject();
			for (Aluno aluno : recuperados) {
				System.out.println(aluno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
