package aula2Exercicio2;

public class Conta {
	
	/**
	 * atributo que representa o número da conta bancária
	 */
	private int numero;
	
	/**
	 * atributo que representa o saldo da conta bancária
	 */
	private double saldo;
	
	/**
	 * método que retorna o número da conta bancária
	 * @return
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * método que retorna o saldo da conta bancária
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * método que seta o número da conta bancária
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	/**
	 * método para depositar
	 * @param valor
	 */
	public void depositar(double valor) {
		saldo += valor;
	}
	
	/**
	 * método para sacar
	 */
	public void sacar(double valor) {		
		if(saldo >= valor)
			saldo -= valor;
		else
			System.out.println("Saldo insuficiente");		
	}
	
	@Override
	public String toString() {		
		return "\nDados da conta \n..Número: "+numero+"\n..Saldo: "+saldo+"\n";
	}
	
}






