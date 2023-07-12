package aula4Exercicio5;

/**
 * 
 */
public class PagamentoCartao implements ProcessadorPagamento {

	@Override
	public double processadorPagamento(double value) {

		System.out.println("Processing credit card payment of $" + value);
		
		return 0;
	}

}
