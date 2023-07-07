package aula3Exercicio1;

public class Carro extends Veiculo {
	
	private int velocidadeMaxima = 200;
		
	@Override
	public void acelerar() {	
	
		int novaVelocidade = super.getVelocidadeAtual() + 52;
		
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
	 * Retorna a velocidade máxima do carro
	 * @return
	 */
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}	
}
