package aula3Exercicio1;

public class Test {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		System.out.println("Velocidade m�xima que o ve�culo pode alcan�ar: "+carro.getVelocidadeMaxima());
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		
		System.out.println();
		Moto moto = new Moto();
		System.out.println("Velocidade m�xima que a moto pode alcan�ar: "+moto.getVelocidadeMaxima());
		moto.acelerar();
		moto.acelerar();
		moto.acelerar();
		moto.acelerar();
		moto.acelerar();
	}

}
