package aula20190430.introducao_a_sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static final int PORT = 9092;
	
	public static void main(String[] args) {
		Server s = new Server();
		s.start();
	}
	
	public void start() {
		System.out.println("Inicializando o servidor...");
		
		try {
			ServerSocket socket = new ServerSocket(PORT);
			System.out.println("Servidor ouvindo na porta " + PORT);
			Socket toClient = socket.accept();
			PrintWriter writer = new PrintWriter(toClient.getOutputStream());
			writer.println("Oi client! \n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Servidor finalizado.");
		
	}

}
