package Exe14;

public class Pix implements MetodoPagamento {

	private String chavePix;

	public Pix(String chavePix) {
		this.chavePix = chavePix;
	}

	@Override
	public void realizarPagamento(double valor) {

		System.out.printf("Pagamento de R$ %.2f realizado com Pix. Transação instantânea.\n", valor);
		System.out.println("Chave Pix: " + chavePix);
	}
}