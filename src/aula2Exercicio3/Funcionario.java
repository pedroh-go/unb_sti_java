package aula2Exercicio3;

public class Funcionario {
	
	/**
	 * atributo que representa o nome do funcionário
	 */
	private String nome;
	
	/**
	 * atributo que representa o salário do funcionário
	 */
	private double salario;
	
	/**
	 * método para obter o nome do funcionário
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * método para setar o nome do funcionário
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * método para obter o salário do funcionário
	 * @return
	 */
	public double getSalario() {
		return salario;
	}
	
	/**
	 * método para setar o salário do funcionário
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
