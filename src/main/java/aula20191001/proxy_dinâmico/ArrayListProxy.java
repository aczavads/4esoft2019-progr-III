package aula20191001.proxy_dinâmico;

import java.util.ArrayList;

public class ArrayListProxy<TIPO> extends ArrayList<TIPO> {
	private int contador;

	public ArrayListProxy(ArrayList<TIPO> arrayList) {
	}
	
	@Override
	public TIPO remove(int arg0) {
		contador++;
		return super.remove(arg0);
	}
	
	@Override
	public boolean remove(Object arg0) {
		contador++;
		return super.remove(arg0);
	}

	public int getContador() {
		return  contador;
	}


}
