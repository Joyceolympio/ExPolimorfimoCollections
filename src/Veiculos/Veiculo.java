package Veiculos;

public abstract class Veiculo {
	
	protected float velMax;
	protected float peso;
	protected float preco;
	
	public void EntrVeic(float velMax, float peso, float preco) {
		this.velMax = velMax;
		this.peso = peso;
		this.preco = preco;
	}
	
	public void MostrVeic() {
		System.out.println("Velocidade Máxima: "+this.velMax+"km/h");
		System.out.println("Preço: "+this.preco+"R$");
		System.out.println("Peso: "+this.peso+"Kg");
	}

}
