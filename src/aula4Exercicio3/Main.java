package aula4Exercicio3;

public class Main {

	public static void main(String[] args) {

        Aluno[] alunos = new Aluno[10];
        alunos[0] = new Aluno("Pedro", 15);
        alunos[1] = new Aluno("Aline", 23);
        alunos[2] = new Aluno("Marta", 33);
        alunos[3] = new Aluno("Júlia", 24);
        alunos[4] = new Aluno("Ana", 19);
        alunos[5] = new Aluno("Mara", 14);
        alunos[6] = new Aluno("Fabi", 48);
        alunos[7] = new Aluno("Fran", 59);
        alunos[8] = new Aluno("Marcos", 71);
        alunos[9] = new Aluno("Amanda", 9);

        Aluno alunoIdadeMaior = maximaIdade(alunos);
        Aluno alunoIdadeMenor = minimaIdade(alunos);

        System.out.println("Aluno com maior idade: " + alunoIdadeMaior.getNome() + ", " + alunoIdadeMaior.getIdade()+"\nAluno com menor idade: " + alunoIdadeMenor.getNome() + ", " + alunoIdadeMenor.getIdade());    

	}
	
	/**
	 * 
	 * @param alunos
	 * @return
	 */
    public static Aluno maximaIdade(Aluno[] alunos) {

        Aluno maximaIdade = alunos[0];
        for (int i = 1; i < alunos.length; i++)
            if (alunos[i].comparar(maximaIdade) > 0)
            	maximaIdade = alunos[i];
        
        return maximaIdade;
    }
    
    /**
     * 
     * @param alunos
     * @return
     */
    public static Aluno minimaIdade(Aluno[] alunos) {

        Aluno minimaIdade = alunos[0];
        for (int i = 1; i < alunos.length; i++)
            if (alunos[i].comparar(minimaIdade) < 0)
            	minimaIdade = alunos[i];
        
        return minimaIdade;
    }
}
