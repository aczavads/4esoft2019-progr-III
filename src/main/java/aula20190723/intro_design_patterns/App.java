package aula20190723.intro_design_patterns;

public class App {
	
	public static void main(String[] args) {
		try {
			Universo.getVersion();		
			System.out.println(Universo.getInstance());
			System.out.println(Universo.getInstance());
			System.out.println(Universo.getInstance());
			System.out.println(Universo.getInstance());
			System.out.println(Universo.getInstance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Foi.");
		
		
	}

}
