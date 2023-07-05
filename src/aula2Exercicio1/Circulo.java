package aula2Exercicio1;

public class Circulo extends Forma {

	private double raio;

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(raio, raio);
	}
	
	@Override
	public double calcularPerimetro() {
		return (2 * Math.PI) * raio;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * 
	 * @param raio
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}
}
