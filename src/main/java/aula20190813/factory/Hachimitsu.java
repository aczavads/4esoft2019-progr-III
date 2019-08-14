package aula20190813.factory;

public abstract class Hachimitsu {

	public static Confeito criarConfeito(Sabor sabor) {
		if (sabor == Sabor.ADOCICADO) {
			return new Tiramisu();
		} else if (sabor == Sabor.ACIDO){
			return new TortaDeLimao();
			//return new TorteleteDeFrutasCitricas();
		}
		return null;
	}

}
