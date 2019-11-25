package caracteristica;

public class Carnivoro extends Animal {

	private String alimentacao;
	
	public void dieta() {
		setAlimentacao("Outros Animais");
	}
	
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}


	public String getAlimentacao() {
		return this.alimentacao;
	}

}
