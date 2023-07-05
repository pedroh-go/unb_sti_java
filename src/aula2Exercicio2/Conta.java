package aula2Exercicio2;

public class Conta {
	
	/**
	 * atributo que representa o n�mero da conta banc�ria
	 */
	private int numero;
	
	/**
	 * atributo que representa o saldo da conta banc�ria
	 */
	private double saldo;
	
	/**
	 * m�todo que retorna o n�mero da conta banc�ria
	 * @return
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * m�todo que retorna o saldo da conta banc�ria
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * m�todo que seta o n�mero da conta banc�ria
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	/**
	 * m�todo para depositar
	 * @param valor
	 */
	public void depositar(double valor) {
		saldo += valor;
	}
	
	/**
	 * m�todo para sacar
	 */
	public void sacar(double valor) {		
		if(saldo >= valor)
			saldo -= valor;
		else
			System.out.println("Saldo insuficiente");		
	}
	
	@Override
	public String toString() {		
		return "\nDados da conta \n..N�mero: "+numero+"\n..Saldo: "+saldo+"\n";
	}
	
}






