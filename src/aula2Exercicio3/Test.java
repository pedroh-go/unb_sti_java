package aula2Exercicio3;

import java.util.Scanner;

public class Test {
		
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		Gerente g1 = new Gerente();
		
		System.out.print("Informe o nome do Gerente:");
		g1.setNome(scanner.nextLine());
		
		System.out.print("Informe o salário do Gerente:");
		g1.setSalario(scanner.nextDouble());
		
		scanner.close();
		
		System.out.println();		
		System.out.println(g1);		
	}
	
}
