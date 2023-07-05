package aula4Exercicio1;

public class Test {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setVelocidade(40);
		
		carro.acelerar(carro.getVelocidade());
		carro.acelerar(carro.getVelocidade());
		carro.acelerar(carro.getVelocidade());
		carro.frear();
		
		System.out.println();
		
		Moto moto = new Moto();
		moto.setVelocidade(60);
		
		moto.acelerar(moto.getVelocidade());
		moto.acelerar(moto.getVelocidade());
		moto.acelerar(moto.getVelocidade());
		moto.frear();	
	}

}
