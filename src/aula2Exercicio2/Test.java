package aula2Exercicio2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o número da conta para depósito: ");
		cc1.setNumero(scanner.nextInt());
		
		System.out.print("Informe o valor do depósito: ");
		cc1.depositar(scanner.nextDouble());
		
		System.out.println(cc1.toString());
		
		System.out.print("Informe quanto deseja sacar: ");
		cc1.sacar(scanner.nextDouble());
		
		System.out.println(cc1.toString());
		
		scanner.close();
	}
}
