package aula20191001.proxy_dinâmico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ArrayListProxyDinâmico  {


	public static Object create(ArrayList arrayListVerdadeiro) {
		
		Object proxy = Proxy.newProxyInstance(
				ArrayListProxyDinâmico.class.getClassLoader(), 
				new Class[] {List.class}, 
			new InvocationHandler() {
				private int contador = 0;
			@Override
			public Object invoke(Object proxy, Method método, Object[] argumentos) throws Throwable {
				System.out.println("{PRÉ} >> " + método);
				Object retorno = método.invoke(arrayListVerdadeiro, argumentos);
				System.out.println("{PÓS} >> " + método);
				return retorno;
			}
		});
		return proxy;
	}
	
}
