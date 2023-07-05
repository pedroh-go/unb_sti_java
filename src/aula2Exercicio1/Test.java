package aula2Exercicio1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("Informe o valor do Raio para calcular a área e o perímetro:");
		Double raio = scanner.nextDouble();
		scanner.close();
		
		Circulo circulo = new Circulo();
		circulo.setRaio(raio);
		
		System.out.println();
		//System.out.println("Resultado: \nCálculo da área: "+circulo.calcularArea()+"\nPerímetro: "+circulo.calcularPerimetro());
		
		System.out.printf("Resultado\n..Área: %.2f \n..Perímetro: %.2f", circulo.calcularArea(), circulo.calcularPerimetro());
	}
}
