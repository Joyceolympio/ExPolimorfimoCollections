package Veiculos;

public class Caminhao extends Veiculo {
	
	private float toneladas;
	private float altMax;
	private float comprimento;
	
	public void EntrCam(float toneladas,float altMax,float comprimento) {
		this.toneladas = toneladas;
		this.altMax = altMax;
		this.comprimento = comprimento;
	}
	
	public void MostrCam() {
		System.out.println("Altura Máxima: "+this.altMax);
		System.out.println("Toneladas: "+this.toneladas);
		System.out.println("Comprimento: "+this.comprimento);
	}
}
