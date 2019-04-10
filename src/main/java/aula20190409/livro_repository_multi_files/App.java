package aula20190409.livro_repository_multi_files;

import java.math.BigDecimal;

public class App {
	
	public static void main(String[] args) {
		BigDecimal valor = new BigDecimal((float)2030/1000).setScale(0, BigDecimal.ROUND_UP);
		System.out.println(valor);
	}

}
