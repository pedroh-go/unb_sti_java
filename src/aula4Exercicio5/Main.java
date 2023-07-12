package aula4Exercicio5;

public class Main {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ProcessadorPagamento cartao = new PagamentoCartao();
        ProcessadorPagamento boleto = new PagamentoBoleto();

        double valorPago = 100.50;
        cartao.processadorPagamento(valorPago);
        boleto.processadorPagamento(valorPago);
    }
	
}
