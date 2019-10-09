package aula20191001.proxy_din�mico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ArrayListProxyDin�mico  {


	public static Object create(ArrayList arrayListVerdadeiro) {
		
		Object proxy = Proxy.newProxyInstance(
				ArrayListProxyDin�mico.class.getClassLoader(), 
				new Class[] {List.class}, 
			new InvocationHandler() {
				private int contador = 0;
			@Override
			public Object invoke(Object proxy, Method m�todo, Object[] argumentos) throws Throwable {
				System.out.println("{PR�} >> " + m�todo);
				Object retorno = m�todo.invoke(arrayListVerdadeiro, argumentos);
				System.out.println("{P�S} >> " + m�todo);
				return retorno;
			}
		});
		return proxy;
	}
	
}
