package aula20190723.intro_design_patterns;

public class Universo {
	private static Universo oÚnicoUniverso;
	
	private Universo() {
		if (System.currentTimeMillis()%2==0) {
			throw new RuntimeException("Vixe!");
		}
		System.out.println("Criou!");
	}
	
	public static Universo getInstance() {
		if (oÚnicoUniverso == null) {
			oÚnicoUniverso = new Universo();
		}
		return oÚnicoUniverso;
	}
	
	public static String getVersion() {
		return "1";
	}

}
