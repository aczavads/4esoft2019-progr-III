package aula20191105.injeção_de_dependências;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesID {

	@Test
	void testarCalculadora() {
		/*
		ILogger fakeLogger = new ILogger() {
			@Override
			public void log(String message) {
				
			}
		};
		*/

		ILogger fakeLogger = (message) -> {};
		Calculadora c = new Calculadora( fakeLogger );
		
		double resultado = c.somar(20.0,30.0);		
		assertEquals(50, resultado, 0.00);

		resultado = c.somar(22.0,22.0);		
		assertEquals(44.0, resultado, 0.00);

	}

}
