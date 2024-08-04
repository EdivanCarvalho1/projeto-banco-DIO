package Banco;

public class Conta implements InterfaceConta {
	Cliente cliente;
	private int num;
	private int agencia;
	private double saldo;
	
	public Conta(Cliente cliente, int num, int agencia, double saldo) {
		super();
		this.cliente = cliente;
		this.num = num;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double valor) {
		if(saldo > valor) {
			saldo -= valor;
		}else {
			System.out.println("Você não possui saldo o suficiente");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, InterfaceConta contaDestino) {
		contaDestino.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.num));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}
	
	
}
