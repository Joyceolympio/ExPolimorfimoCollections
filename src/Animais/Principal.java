package Animais;

public class Principal {
	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Zarah",1);
		Preguica preguica = new Preguica("Lyra",1);
		Cavalo cavalo = new Cavalo("cavalo",5);
		
		Veterinario veterinario = new Veterinario();
		
		System.out.println("Cachorro:");
		cachorro.mover();
		veterinario.examinar(cachorro);

		
		System.out.println("Preguiça:");
		preguica.mover();
		veterinario.examinar(preguica);

		
		System.out.println("Cavalo:");
		cavalo.mover();
		veterinario.examinar(cavalo);
		
	}

}
