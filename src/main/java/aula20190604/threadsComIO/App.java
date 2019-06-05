package aula20190604.threadsComIO;

import java.io.File;

public class App {
	
	public static void main(String[] args) {
		
		compactarDLLs("c:/windows/system32", "d:/arthur/dlls", 15);
		
	}

	private static void compactarDLLs(String diretorioOrigem, String diretorioDestino, int numeroDeThreads) {
		File[] dlls = encontrarDllsEm(diretorioOrigem);
		int porThread = (int)dlls.length/numeroDeThreads;
		int resto = dlls.length - (porThread*numeroDeThreads);
		
		//Como calcular o tamanho para cada thread
		//tamanho=100
		//threads=3
		//tamanho/threads = 33.33333333333333333333333333...
		//Não temos como trabalhar com 0.3333333333... rquivo, somente com arquivos inteiros! :D
		//Então:
		//int quantidade = (int)tamanho/threads   ==> 33 (Desprezamos a parte decimal).
		//quantidade*threads ==> 99 (Opa, faltou uma!!! Vamos calcular o resto!).
		//int resto = tamanho - (quantidade*threads)   ==> 1   (100 - (33 * 3))=1  :P
		//Portanto, as duas primeiras threads vão processar 33 arquivos e a última 33 + resto, ou seja, 34. :D
		//Vale para qualquer situação em que se deva considerar divisões com resto e se deseja trabalhar com valores inteiros.
		
		
		
		Compactador[] compactadores = Compactador.criarCompactadores(numeroDeThreads, diretorioDestino);		
		System.out.println("Total de arquivos=" + dlls.length + ".Por thread=" + porThread +". Resto=" + resto );
		
		int limite = porThread;		
		int contadorCompactador = 0;
		for (int i = 0; i < dlls.length; i++) {
			System.out.println(i + ", " + contadorCompactador);
			compactadores[contadorCompactador].adicionar(dlls[i]);
			if (proximaThread(limite, i)) {
				if (ultimaThread(numeroDeThreads, contadorCompactador)) {
					limite += resto;
				} else {
					contadorCompactador++;
					limite += porThread;					
				}
			}
		}
		for (Compactador compactador : compactadores) {
			compactador.start();
		}
	}

	private static boolean ultimaThread(int numeroDeThreads, int contadorCompactador) {
		return contadorCompactador == numeroDeThreads-1;
	}

	private static boolean proximaThread(int limite, int i) {
		return ultimaThread(limite, i);
	}

	private static File[] encontrarDllsEm(String diretorioOrigem) {
		File origem = new File(diretorioOrigem);
		/*
		File[] arquivos = origem.listFiles(new FileFilter() {			
			@Override
			public boolean accept(File f) {
				return f.getName().endsWith(".dll");
			}
		});
		*/
		return origem.listFiles( (f) -> f.getName().endsWith(".dll") );
	}

}
