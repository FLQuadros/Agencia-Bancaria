package br.soulcode.Aula06_04_AgenciaBancaria;

public class ContaCorrente extends Conta {
	
	private final int identificador = 03;

	public ContaCorrente(String nomeCliente, int numero, double saldo) {
		super(nomeCliente, numero, saldo);
		
	}
		
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Identificador do tipo de conta: " + this.identificador);
	}

	@Override
	public void sacar(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("--------------------------------");
			System.out.println("Saque realizado! Saldo da conta: " + this.getSaldo());
		} else {
			System.out.println("--------------------------------");
			System.out.println("Saldo insuficiente!");
			System.out.println("Saldo da conta: " + this.getSaldo());
		}
		
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("--------------------------------");
		System.out.println("Depósito realizado! Saldo da conta: " + this.getSaldo());
		
	}

	public int getIdentificador() {
		return identificador;
	}


	

	
	
	
	

}
