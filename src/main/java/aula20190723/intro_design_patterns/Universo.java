package aula20190723.intro_design_patterns;

public class Universo {
	private static Universo o�nicoUniverso;
	
	private Universo() {
		if (System.currentTimeMillis()%2==0) {
			throw new RuntimeException("Vixe!");
		}
		System.out.println("Criou!");
	}
	
	public static Universo getInstance() {
		if (o�nicoUniverso == null) {
			o�nicoUniverso = new Universo();
		}
		return o�nicoUniverso;
	}
	
	public static String getVersion() {
		return "1";
	}

}
