package aula2Exercicio4;

public class Aluno {
	
	/**
	 * atributo que representa o nome do aluno
	 */
	private String nome;
	
	/**
	 * atributo que representa a matr�cula do aluno
	 */
	private int matricula;
	
	/**
	 * atributo que representa o curso do aluno
	 */
	private String curso;
	
	/**
	 * construtor padr�o
	 */
	public Aluno() {
		nome = "Carlos Aluno padr�o";
		matricula = 101010;
		curso = "An�lise de SIstemas";
	}
	
	/**
	 * Construtor com par�metros
	 * @param nome
	 * @param matricula
	 * @param curso
	 */
	public Aluno(String nome, int matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	/**
	 * m�todo para obter o nome
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 *  m�todo para setar o nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 *  m�todo para obter a matr�cula
	 * @return
	 */
	public int getMatricula() {
		return matricula;
	}
	
	/**
	 *  m�todo para setar a matr�cula
	 * @param matricula
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * m�todo para obter o curso
	 * @return
	 */
	public String getCurso() {
		return curso;
	}
	
	/**
	 * m�todo para setar o curso
	 * @param curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Dados do Aluno \n..Nome: "+getNome()+"\n..Matr�cula: "+getMatricula()+"\n..Curso: "+getCurso();
	}
}
