package aula4Exercicio4;

public class Triangulo implements Figura{
	
	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * 
	 * @param base
	 * @param altura
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
	    this.base = base;
	    this.altura = altura;
	    this.lado1 = lado1;
	    this.lado2 = lado2;
	    this.lado3 = lado3;
	}

	@Override
	public double calcularArea() {
		return 0.5 * base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}

}
