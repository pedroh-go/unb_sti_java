package aula2Exercicio1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Informe o valor do Raio para calcular a �rea e o per�metro:");
		Double raio = scanner.nextDouble();
		scanner.close();
		
		Circulo circulo = new Circulo();
		circulo.setRaio(raio);
		
		System.out.println();
		//System.out.println("Resultado: \nC�lculo da �rea: "+circulo.calcularArea()+"\nPer�metro: "+circulo.calcularPerimetro());
		
		System.out.printf("Resultado\n..�rea: %.2f \n..Per�metro: %.2f", circulo.calcularArea(), circulo.calcularPerimetro());
	}
}
