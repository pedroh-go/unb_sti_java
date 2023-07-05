package aula4Exercicio1;

public abstract class Veiculo {
	
	private int velocidade;
	
	/**
	 * método para acelerar
	 * @return
	 */
	public abstract void acelerar(int velocidade);
	
	public abstract void frear();
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
