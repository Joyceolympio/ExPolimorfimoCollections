package Animais;

public class Cavalo extends Animal {
	public Cavalo() {
		super();
	}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		super.setSom("Br„„„...");
		super.setMovimento("Correndo");

	}
	
	public void fazerSom() {
		System.out.println(this.som);
	}
	
	public void mover() {
		System.out.println(this.movimento);
	}
}
