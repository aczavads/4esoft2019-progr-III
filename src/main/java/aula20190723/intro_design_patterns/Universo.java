package aula20190723.intro_design_patterns;

public class Universo {
	private static Universo oŚnicoUniverso;
	
	private Universo() {
		if (System.currentTimeMillis()%2==0) {
			throw new RuntimeException("Vixe!");
		}
		System.out.println("Criou!");
	}
	
	public static Universo getInstance() {
		if (oŚnicoUniverso == null) {
			oŚnicoUniverso = new Universo();
		}
		return oŚnicoUniverso;
	}
	
	public static String getVersion() {
		return "1";
	}

}
