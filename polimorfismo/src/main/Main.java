package main;

import animais.Coelho;

public class Main {

	public static void main(String[] args) {

		Coelho c = new Coelho();
		c.setCor("Branco");
		c.setNome("Tobias");
		System.out.println(c.getAlimentacao()+ c.getCor()+ c.getNome());
	}

}
