package aula4Exercicio4;

public class Circulo implements Figura{
	
	/**
	 * 
	 */
	private double radius;
	
	/**
	 * 
	 * @param radius
	 */
    public Circulo(double radius) {
        this.radius = radius;
    }

	@Override
	public double calcularArea() {
        return Math.PI * radius * radius;
	}

	@Override
	public double calcularPerimetro() {
        return 2 * Math.PI * radius;
	}    
}
