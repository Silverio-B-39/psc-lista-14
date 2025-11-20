package Exe14;

public class CartaoCredito implements MetodoPagamento {

	private String numeroCartao;

	public CartaoCredito(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Override
	public void realizarPagamento(double valor) {

		System.out.printf("Pagamento de R$ %.2f realizado com Cartão de Crédito. Cobrança de 5%% de taxa.\n", valor);
		System.out.println("Número do Cartão: " + numeroCartao);
	}
}