package aula20190521.aep2_1;

import java.io.File;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class AppServer {

	public static void main(String[] args) {
		AppServer server = new AppServer();
		try {
			server.executar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void executar() throws Exception {
		System.out.println("[server] listening...");
		ServerSocket serverSocket = new ServerSocket(8080);
		String comando = "";
		while (true) {
			Socket clientSocket = serverSocket.accept();
			PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
			Scanner fromClient = new Scanner(clientSocket.getInputStream());
			toClient.println("Olá client! Hoje é:" + (new Date().toString()));
			while (!comando.equals("disconnect")) {
				toClient.flush();
				comando = fromClient.nextLine();
				if (comando.startsWith("ls")) {
					String[] partesDoComando = comando.split(" ");
					String nomeDoDiretorio = partesDoComando[1];
					String parametros = partesDoComando[2].replaceAll("-", "");
					File diretorio = new File(nomeDoDiretorio);
					boolean recursivo = parametros.equals("r");
					String listagem = listarArquivos(diretorio, recursivo);
					toClient.println(listagem);
					toClient.flush();
				}
			}
		}
	}

	private String listarArquivos(File diretorio, boolean recursivo) {
		return "tem nada não... :P";
	}
}