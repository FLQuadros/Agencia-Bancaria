package br.soulcode.Aula06_04_AgenciaBancaria;

public abstract class Conta implements InterfaceConta {
	
	private String nomeCliente;
	private int numero;
	private double saldo;
	
	public Conta(String nomeCliente, int numero, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void mostrarDados() {
		System.out.println("--------------------------------");
		System.out.println("Nome do correntista: " + this.nomeCliente);
		System.out.println("Número da conta: " + this.numero);
		System.out.println("Saldo da conta: " + this.saldo);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	

	

}
