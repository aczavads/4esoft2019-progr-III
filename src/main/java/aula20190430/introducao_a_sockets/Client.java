package aula20190430.introducao_a_sockets;

import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		Client c = new Client();
		c.start();
	}

	private void start() {
		try {
			Socket toServer = new Socket("localhost", 9092);
			Scanner reader =  new  Scanner(toServer.getInputStream());
			String resposta = reader.nextLine();
			System.out.println("Resposta do servidor: " + resposta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
