package Exe14;

public class Boleto implements MetodoPagamento {

	private String codigoBarra;

	public Boleto(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	@Override
	public void realizarPagamento(double valor) {

		System.out.printf("Pagamento de R$ %.2f realizado com Boleto. Boleto gerado e enviado por e-mail.\n", valor);
		System.out.println("Código de Barras: " + codigoBarra);
	}
}