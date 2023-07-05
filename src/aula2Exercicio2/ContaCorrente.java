package aula2Exercicio2;

public class ContaCorrente extends Conta{
	
	/**
	 * 
	 */
	private double limite;
	
	/**
	 * 
	 * @return
	 */
	public double getLimite() {
		return limite;
	}
	
	/**
	 * 
	 * @param limite
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}
		
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
	}
	
}
