package aula3Exercicio1;

public class Moto extends Veiculo{
	
	@Override
	public double acelerar() {
		return 300;
	}
	
	@Override
	public String toString() {		
		return "Velocidade máxima da moto: "+acelerar();
	}
}
