package aula4Exercicio3;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		Array[] aluno = new Array[10];

	}
	
	public Aluno maxIdade(Aluno[] alunos) {
		
		for (Aluno aluno : alunos)
			aluno = aluno.comparar(aluno);
	
	}
	
	public Aluno minIdade(Aluno[] alunos) {
		
	}

}
