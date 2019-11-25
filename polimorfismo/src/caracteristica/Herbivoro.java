package caracteristica;

public class Herbivoro extends Animal {
	
	private String alimentacao;
	
	public void dieta() {
		setAlimentacao("Plantas, legumes, e vegetais");
	}
	
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getAlimentacao() {
		return this.alimentacao;
	}
	
	

}
