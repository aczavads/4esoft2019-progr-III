package aula20191001.injeção_de_dependências;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class EsoftInjectorPlus {
	private List<Object> dependencies = new ArrayList<>();

	public void registerDependency(Object dependency) {
		dependencies.add(dependency);
	}

	public <T> T create(Class<T> clazz) {
		try {
			Field[] declaredFields = clazz.getDeclaredFields();
			T obj = clazz.newInstance();
			for (Field field : declaredFields) {
				if (field.isAnnotationPresent(InjetePorFavor.class)) {
					injectInto(obj, field);
				}
			}
			
			return obj;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void injectInto(Object target, Field field) {
		Class fieldType = field.getType();
		for (Object dep : dependencies) {
			if (dep.getClass().equals(fieldType)) {
				field.setAccessible(true);
				try {
					field.set(target, dep);
				} catch (Exception e) {
					e.printStackTrace();
				}
				field.setAccessible(false);
			}
		}
	}

}
