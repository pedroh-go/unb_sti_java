package aula3Exercicio1;

public class Moto extends Veiculo{
	
	private int velocidadeMaxima = 250;
	
	@Override
	public void acelerar() {
		
		int novaVelocidade = super.getVelocidadeAtual() + 75;
		
		if(super.getVelocidadeAtual() != velocidadeMaxima) {
			
			if(novaVelocidade >= velocidadeMaxima) {
				super.setVelocidadeAtual(velocidadeMaxima);
				System.out.println("Velocidade máxima atingida: "+velocidadeMaxima);
			}else {
				super.setVelocidadeAtual(novaVelocidade);
				System.out.println("Acelerando para: "+super.getVelocidadeAtual());
			}
		}
	}
	
	/**
	 * Retorna a velocidade máxima da moto
	 * @return
	 */
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
}
