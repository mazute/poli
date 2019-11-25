package main;

import animais.Coelho;
import animais.Leao;

public class Main {

	public static void main(String[] args) {

		Coelho c = new Coelho();
		c.setCor("Branco");
		c.setNome("Coelho");
		c.dieta();
		System.out.println("Nome: " + c.getNome() + "\n" +
				"Alimentação: " + c.getAlimentacao() + "\n" +
				"Cor: " + c.getCor() + "\n");
		
		
		Leao l = new Leao();
		l.setCor("Amarelo");
		l.setNome("Leão");
		l.dieta();
		System.out.println("Nome: " + l.getNome() + "\n" +
				"Alimentação: " + l.getAlimentacao() + "\n" +
				"Cor: " + l.getCor() + "\n");
		
	}

}
