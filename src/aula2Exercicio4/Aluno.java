package aula2Exercicio4;

public class Aluno {
	
	/**
	 * atributo que representa o nome do aluno
	 */
	private String nome;
	
	/**
	 * atributo que representa a matrícula do aluno
	 */
	private int matricula;
	
	/**
	 * atributo que representa o curso do aluno
	 */
	private String curso;
	
	/**
	 * construtor padrão
	 */
	public Aluno() {
		nome = "Carlos Aluno padrão";
		matricula = 101010;
		curso = "Análise de SIstemas";
	}
	
	/**
	 * Construtor com parâmetros
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
	 * método para obter o nome
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 *  método para setar o nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 *  método para obter a matrícula
	 * @return
	 */
	public int getMatricula() {
		return matricula;
	}
	
	/**
	 *  método para setar a matrícula
	 * @param matricula
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * método para obter o curso
	 * @return
	 */
	public String getCurso() {
		return curso;
	}
	
	/**
	 * método para setar o curso
	 * @param curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Dados do Aluno \n..Nome: "+getNome()+"\n..Matrícula: "+getMatricula()+"\n..Curso: "+getCurso();
	}
}
