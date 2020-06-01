package Veiculos;

public class Principal {
	public static void main(String[] args) {

		Carro car = new Carro();
		
		car.EntrVeic(40, 97, 22350);
		car.EntrPass("Branco", "New Fiesta");
		car.MostrVeic();
		car.MostrPass();
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.EntrVeic(90, 900, 9870);
		caminhao.EntrCam(800, 5, 7);
		caminhao.MostrVeic();
		caminhao.MostrCam();
		
	}
}
