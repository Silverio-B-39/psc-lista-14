package Exe14;

public class ProcessadorPagamento {

	public static void processar(MetodoPagamento metodo, double valor) {
		System.out.println("--- Iniciando o Processamento... ---");

		metodo.realizarPagamento(valor);
		System.out.println("--- Processamento Concluído. ---\n");
	}
}
