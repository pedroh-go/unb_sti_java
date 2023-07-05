package aula2Exercicio3;

public class Gerente extends Funcionario {
	
	private String departamento;	
	
	public double calcularBonusSalarial() {		
		return getSalario() * 0.2;		
	}
	
	@Override
	public String toString() {		
		return "Dados do Gerente \n..Nome: "+getNome()+"\n..Salário: "+getSalario()+"\n..Bônus salárial: "+calcularBonusSalarial();
	}
	
}
