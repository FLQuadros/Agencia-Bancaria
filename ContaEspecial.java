package br.soulcode.Aula06_04_AgenciaBancaria;

public class ContaEspecial extends Conta {
	
	private final int identificador = 05;
	private double limite;
	private double saldoLimite;

	public ContaEspecial(String nomeCliente, int numero, double saldo, double limite) {
		super(nomeCliente, numero, saldo);
		this.limite = limite;
		this.saldoLimite = limite;
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Limite do cheque especial: " + this.limite);
		System.out.println("Identificador do tipo de conta: " + this.identificador);
	}
	
	@Override
	public void sacar(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("--------------------------------");
			System.out.println("Saque realizado! Saldo da conta: " + this.getSaldo());
		} else if (this.getSaldo() + this.getSaldoLimite() >= valor ) {		
			this.setSaldoLimite(this.getSaldoLimite() - (valor - this.getSaldo()));
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("--------------------------------");
			System.out.println("Saque realizado! Saldo da conta: " + this.getSaldo());
			System.out.println("Saldo do cheque especial: " + this.getSaldoLimite());	
		} else if (this.getSaldo() + this.getSaldoLimite() <= valor && this.getSaldoLimite() >= valor) {
			this.setSaldoLimite(this.getSaldoLimite() - valor);
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("--------------------------------");
			System.out.println("Saque realizado! Saldo da conta: " + this.getSaldo());
			System.out.println("Saldo do cheque especial: " + this.getSaldoLimite());
		} else {
			System.out.println("--------------------------------");
			System.out.println("Limite do saldo do cheque especial insuficiente!");
			System.out.println("Saldo do cheque especial: " + this.getSaldoLimite());
			System.out.println("Saldo da conta: " + this.getSaldo());
		}
		
	}

	@Override
	public void depositar(double valor) {
		if ( this.getSaldo() >= -this.limite && this.getSaldo() <= 0 && this.getSaldoLimite() + valor < this.limite) {
			this.setSaldo(this.getSaldo() + valor);
			this.setSaldoLimite(this.getSaldoLimite() + valor);
			System.out.println("--------------------------------");
			System.out.println("Depósito realizado! Saldo da conta: " + this.getSaldo());
		} else if (this.getSaldoLimite() + valor > this.limite) {
			this.setSaldo(this.getSaldo() + valor);
			this.setSaldoLimite(this.limite);
			System.out.println("--------------------------------");
			System.out.println("Depósito realizado! Saldo da conta: " + this.getSaldo());
		} else {
			this.setSaldo(this.getSaldo() + valor);
			this.setSaldoLimite(this.limite);
			System.out.println("--------------------------------");
			System.out.println("Depósito realizado! Saldo da conta: " + this.getSaldo());
		}
	}
	
	public void ajustarLimite(double novoValor) {
		this.setSaldoLimite(novoValor - (this.getLimite() - this.getSaldoLimite()));
		
		this.setLimite(novoValor);
		
		System.out.println("Limite: " + this.getLimite());
		System.out.println("Saldo do Limite: " + this.getSaldoLimite());
		
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSaldoLimite() {
		return saldoLimite;
	}

	public void setSaldoLimite(double saldoLimite) {
		this.saldoLimite = saldoLimite;
	}
	
	

	

	
	
	

}
