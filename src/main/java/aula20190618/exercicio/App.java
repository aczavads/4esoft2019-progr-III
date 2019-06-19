package aula20190618.exercicio;

public class App {
	
	public static void main(String[] args) {
		//Envio cliente01->server: Oi galera!
		//Retorno server->client: {client01: { Oi galera! }}
		
		Client c1 = new Client("client01");
		c1.setMensagem("Olá, bom dia!");
		c1.setQuantidadeDeMensagens(100);
		c1.setEsperaEntreMensagensEmMilisegundos(200);
		c1.iniciar();
		/*
		Client c2 = new Client("client02");
		c2.setMensagem("Olá, bom dia!");
		c2.setQuantidadeDeMensagens(100);
		c2.setEsperaEntreMensagensEmMilisegundos(200);
		c2.iniciar();

		Client c3 = new Client("client03");
		c3.setMensagem("Olá, bom dia!");
		c3.setQuantidadeDeMensagens(100);
		c3.setEsperaEntreMensagensEmMilisegundos(200);
		c3.iniciar();
		*/

	}

}
