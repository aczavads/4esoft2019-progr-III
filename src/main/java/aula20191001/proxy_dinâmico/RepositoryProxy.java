package aula20191001.proxy_din�mico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public abstract class RepositoryProxy {

	public static Object criarProxy(Class<?> clazz) {
		
		Object proxy = Proxy.newProxyInstance(
				RepositoryProxy.class.getClassLoader(),
				new Class[] {clazz}, 
				new InvocationHandler() {				
					@Override
					public Object invoke(Object objeto, Method m�todo, Object[] argumentos) throws Throwable {
						if (m�todo.getName().startsWith("findById")) {
							return findById(argumentos[0]);
						}
						System.out.println("M�todo: "+ m�todo);
						for(Object argumento: argumentos) {
							System.out.println("   " + argumento);
						}
						return null;
					}
				}
		);
		return proxy;
	}

	protected static Object findById(Object object) {
		return null;
	}

}
