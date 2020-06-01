package Animais;

public class Preguica extends Animal {
	public Preguica() {
		super();
	}
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
		super.setSom("Ahhhhhh...");
		super.setMovimento("Subindo arvore");

	}
	
	public void fazerSom() {
		System.out.println(this.som);
	}
	
	public void mover() {
		System.out.println(this.movimento);
	}
}
