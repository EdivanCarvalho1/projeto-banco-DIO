package Banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, int num, int agencia, double saldo) {
		super(cliente, num, agencia, saldo);
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato===");
		super.imprimirExtrato();
	}
	
}
