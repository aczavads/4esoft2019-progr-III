package aula20190604.threadsComIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;

public class Compactador extends Thread {
	private List<File> arquivos = new ArrayList<>();
	private String diretorioDestino;

	public Compactador(String diretorioDestino) {
		this.diretorioDestino = diretorioDestino;
	}

	public void adicionar(File arquivo) {
		arquivos.add(arquivo);
	}
	
	public int contarArquivos() {
		return arquivos.size();
	}
	
	@Override
	public void run() {
		try {
			for (File file : arquivos) {
				try (InputStream input = new BufferedInputStream(new FileInputStream(file));
				     OutputStream output = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(diretorioDestino + "/" + file.getName() + ".gz")))) {
					int dado = 0;
					while ((dado = input.read()) != -1) {
						output.write(dado);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Compactador[] criarCompactadores(int numeroDeThreads, String diretorioDestino) {
		Compactador[] retorno = new Compactador[numeroDeThreads];
		for (int i = 0; i < numeroDeThreads; i++) {
			retorno[i] = new Compactador(diretorioDestino);			
		}
		return retorno;
	}

}
