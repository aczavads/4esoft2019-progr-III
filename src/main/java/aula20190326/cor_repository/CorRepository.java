package aula20190326.cor_repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CorRepository implements Repository<Cor, String>{
	private static final String FILE_NAME = "d:/repo/CorRepository/dados.ser";
	private Set<Cor> dados = new HashSet<>();

	@Override
	public List<Cor> findAll() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			this.dados = (Set<Cor>) in.readObject();
		} catch (FileNotFoundException e) {
			this.dados = new HashSet<>(); 
		}  catch (Exception e) {
			throw new RuntimeException(e);
		}
		return Collections.unmodifiableList(new ArrayList<>(this.dados));
		//return new ArrayList<>(this.dados);
	}

	@Override
	public void save(Cor cor) {
		this.dados.add(cor);
	}

	@Override
	public void flush() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			out.writeObject(this.dados);
			this.dados.clear();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void removeAll() {
		try {
			File f = new File(FILE_NAME);
			f.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
