package aula20190827.builder;

public class Bolo {
	public Decoração decoração;
	private Massa massa;

	private Bolo() {
		
	}
	
	public Decoração getDecoração() {
		return decoração;
	}
	public Massa getMassa() {
		return massa;
	}	
	public static BoloBuilder builder() {
		return new BoloBuilder();
	}


	
	
	static class BoloBuilder {
		private Decoração decoração;
		private Massa massa;

		public BoloBuilder decoração(Decoração decoração) {
			this.decoração = decoração;
			return this;
		}

		public BoloBuilder massa(Massa massa) {
			this.massa = massa;
			return this;
		}

		public Bolo build() {
			Bolo novo = new Bolo();
			if (this.decoração != null) {
				novo.decoração = this.decoração;
			}
			if (this.massa != null) {
				novo.massa = this.massa;
			}
			return novo;
		}
		
	}

}
