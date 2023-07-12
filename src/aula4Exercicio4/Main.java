package aula4Exercicio4;

public class Main {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Figura quadrado = new Quadrado(4);
		Figura circulo = new Circulo(6);
		Figura triangulo = new Triangulo(5, 6, 4, 5, 6);

		System.out.println(
			"Quadrado -> Área: " + quadrado.calcularArea() + ", Perímetro: " + quadrado.calcularPerimetro()+
			"\nCírculo -> Area: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro()+
			"\nTriangulo -> Area: " + triangulo.calcularArea() + ", Perímetro: " + quadrado.calcularPerimetro()
		);
	}
}
