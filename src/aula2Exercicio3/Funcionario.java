package aula2Exercicio3;

public class Funcionario {
	
	/**
	 * atributo que representa o nome do funcion�rio
	 */
	private String nome;
	
	/**
	 * atributo que representa o sal�rio do funcion�rio
	 */
	private double salario;
	
	/**
	 * m�todo para obter o nome do funcion�rio
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * m�todo para setar o nome do funcion�rio
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * m�todo para obter o sal�rio do funcion�rio
	 * @return
	 */
	public double getSalario() {
		return salario;
	}
	
	/**
	 * m�todo para setar o sal�rio do funcion�rio
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
