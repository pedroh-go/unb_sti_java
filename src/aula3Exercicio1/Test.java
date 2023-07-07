package aula3Exercicio1;

public class Test {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		System.out.println("Velocidade máxima que o veículo pode alcançar: "+carro.getVelocidadeMaxima());
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		
		System.out.println();
		Moto moto = new Moto();
		System.out.println("Velocidade máxima que a moto pode alcançar: "+moto.getVelocidadeMaxima());
		moto.acelerar();
		moto.acelerar();
		moto.acelerar();
		moto.acelerar();
		moto.acelerar();
	}

}
