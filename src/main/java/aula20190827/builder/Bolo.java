package aula20190827.builder;

public class Bolo {
	public Decora��o decora��o;
	private Massa massa;

	private Bolo() {
		
	}
	
	public Decora��o getDecora��o() {
		return decora��o;
	}
	public Massa getMassa() {
		return massa;
	}	
	public static BoloBuilder builder() {
		return new BoloBuilder();
	}


	
	
	static class BoloBuilder {
		private Decora��o decora��o;
		private Massa massa;

		public BoloBuilder decora��o(Decora��o decora��o) {
			this.decora��o = decora��o;
			return this;
		}

		public BoloBuilder massa(Massa massa) {
			this.massa = massa;
			return this;
		}

		public Bolo build() {
			Bolo novo = new Bolo();
			if (this.decora��o != null) {
				novo.decora��o = this.decora��o;
			}
			if (this.massa != null) {
				novo.massa = this.massa;
			}
			return novo;
		}
		
	}

}
