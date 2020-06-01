package Animais;

public class Cachorro extends Animal {
	public Cachorro() {
		super();
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		super.setSom("Au,Au,Au...");
		super.setMovimento("Correndo");

	}

	public void fazerSom() {
		System.out.println(this.som);
	}
	
	public void mover() {
		System.out.println(this.movimento);
	}
}
