package aula2Exercicio5;

import java.util.Scanner;

import aula2Exercicio2.Conta;
import aula2Exercicio2.ContaCorrente;

public class CadastroContas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//Conta 1
		Conta conta1 = new Conta();
		System.out.print("Informe o n�mero da 1� conta para dep�sito: ");
		conta1.setNumero(scanner.nextInt());
		
		System.out.print("Informe o valor do dep�sito para a conta "+conta1.getNumero()+":");
		conta1.depositar(scanner.nextDouble());
		
		System.out.println(conta1.toString());
		
		System.out.print("Informe quanto deseja sacar na conta "+conta1.getNumero()+":");
		conta1.sacar(scanner.nextDouble());
		
		System.out.println("\nDados atualizados:"+conta1.toString());
		System.out.println("___________________________________________________________");
		
		//Conta 2
		Conta conta2 = new Conta();
		System.out.print("Informe o n�mero da 2� conta para dep�sito: ");
		conta2.setNumero(scanner.nextInt());
		
		System.out.print("Informe o valor do dep�sito para a conta "+conta2.getNumero()+":");
		conta2.depositar(scanner.nextDouble());
		
		System.out.println(conta2.toString());
		
		System.out.print("Informe quanto deseja sacar na conta "+conta2.getNumero()+":");
		conta2.sacar(scanner.nextDouble());
		
		System.out.println("\nDados atualizados:"+conta2.toString());
		System.out.println("___________________________________________________________");
		
		//Conta Corrente 1
		Conta contaCorrente1 = new Conta();
		System.out.print("Informe o n�mero da 1� conta corrente para dep�sito: ");
		contaCorrente1.setNumero(scanner.nextInt());
		
		System.out.print("Informe o valor do dep�sito para a conta a corrente "+contaCorrente1.getNumero()+":");
		contaCorrente1.depositar(scanner.nextDouble());
		
		System.out.println(contaCorrente1.toString());
		
		System.out.print("Informe quanto deseja sacar na conta corrente "+contaCorrente1.getNumero()+":");
		contaCorrente1.sacar(scanner.nextDouble());
		
		System.out.println("\nDados atualizados:"+contaCorrente1.toString());
		System.out.println("___________________________________________________________");
		
		//Conta Corrente 2
		Conta contaCorrente2 = new Conta();
		System.out.print("Informe o n�mero da 2� conta corrente para dep�sito: ");
		contaCorrente2.setNumero(scanner.nextInt());
		
		System.out.print("Informe o valor do dep�sito para a conta a corrente "+contaCorrente2.getNumero()+":");
		contaCorrente2.depositar(scanner.nextDouble());
		
		System.out.println(contaCorrente2.toString());
		
		System.out.print("Informe quanto deseja sacar na conta corrente "+contaCorrente2.getNumero()+":");
		contaCorrente2.sacar(scanner.nextDouble());
		
		System.out.println("\nDados atualizados:"+contaCorrente2.toString());
		System.out.println("___________________________________________________________");
		
		scanner.close();

	}

}
