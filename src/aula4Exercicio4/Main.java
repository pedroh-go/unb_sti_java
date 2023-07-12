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
			"Quadrado -> �rea: " + quadrado.calcularArea() + ", Per�metro: " + quadrado.calcularPerimetro()+
			"\nC�rculo -> Area: " + circulo.calcularArea() + ", Per�metro: " + circulo.calcularPerimetro()+
			"\nTriangulo -> Area: " + triangulo.calcularArea() + ", Per�metro: " + quadrado.calcularPerimetro()
		);
	}
}
