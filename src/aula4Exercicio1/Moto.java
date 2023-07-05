package aula4Exercicio1;

public class Moto extends Veiculo{

	@Override
	public void acelerar(int velocidade) {
		
		super.setVelocidade(velocidade + 2);
		
		System.out.println("Acelerando: aumentando a velocidade: "+super.getVelocidade());
	}

	@Override
	public void frear() {
		super.setVelocidade(super.getVelocidade() - 2);	
		
		System.out.println("Freando: reduzindo a velocidade: "+super.getVelocidade());
	}
	
}
