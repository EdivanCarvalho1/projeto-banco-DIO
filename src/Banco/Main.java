package Banco;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Edivan");
		
		InterfaceConta conta1 = new ContaCorrente(cliente1, 1234, 0001, 3000);
		
		conta1.depositar(1000);
		
		conta1.sacar(300);
		
		conta1.imprimirExtrato();

	}

}
