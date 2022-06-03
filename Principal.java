package br.soulcode.Aula06_04_AgenciaBancaria;

public class Principal {

	public static void main(String[] args) {
		
		ContaEspecial CE1 = new ContaEspecial("Filipe", 3334445, 500, 200);
		
		CE1.mostrarDados();
			
		CE1.sacar(250);
		
		CE1.sacar(250);
		
		CE1.sacar(100);
		
		CE1.sacar(100);
		
		CE1.depositar(50);
		
		System.out.println(CE1.getSaldo());
		System.out.println(CE1.getSaldoLimite());
		
		CE1.depositar(50);
		
		System.out.println(CE1.getSaldo());
		System.out.println(CE1.getSaldoLimite());
		
		CE1.depositar(50);
		
		System.out.println(CE1.getSaldo());
		System.out.println(CE1.getSaldoLimite());
		
		CE1.depositar(60);
		
		System.out.println(CE1.getSaldo());
		System.out.println(CE1.getSaldoLimite());
		
		CE1.sacar(100);
		
		CE1.sacar(100);
		
		
		
		
		
		
		
		
		
		
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
