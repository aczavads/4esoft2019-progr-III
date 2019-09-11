package aula20190910.composite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import aula20190910.observer.cofre.CofreListener;

public class CofreListenerComposite implements CofreListener {
	private Set<CofreListener> componentes = new HashSet<>();

	@Override
	public void cofreFoiAberto(int senha, String numeroDeSerie) {
		System.out.println("Opa, chamaram o método do composite!");
		for (CofreListener cofreListener : componentes) {
			cofreListener.cofreFoiAberto(senha, numeroDeSerie);
		}
	}

	public void adicionarListener(CofreListener listener) {
		componentes.add(listener);
	}

}
