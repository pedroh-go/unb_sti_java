package aula4Exercicio4;

class Quadrado implements Figura {
    
	/**
	 * 
	 */
	private double lado;
	
	/**
	 * 
	 * @param lado
	 */
    public Quadrado(double lado) {
        this.lado = lado;
    }

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}
}