package aula4Exercicio3;

public class Aluno extends ObjetoComparavel {
	
	/**
	 * 
	 */
	private String nome;
	
	/**
	 * 
	 */
	private int idade;
	
	/**
	 * Construtor
	 * @param nome
	 * @param idade
	 */
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public int comparar(Comparavel aluno) {
		Aluno outroAluno = (Aluno) aluno;
        if (this.idade < outroAluno.idade)
            return -1;
        else if (this.idade > outroAluno.idade)
            return 1;
        else
            return 0;
    }
}
