package aula3Exercicio1;

public class Carro extends Veiculo {
	
	@Override
	public double acelerar() {		
		return 200;
	}
	
	@Override
	public String toString() {		
		return "Velocidade m�xima do carro: "+acelerar();
	}
	
}
