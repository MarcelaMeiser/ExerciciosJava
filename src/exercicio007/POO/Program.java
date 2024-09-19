package exercicio007.POO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numero = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		Conta conta = null;
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldo = sc.nextDouble();
			conta = new Conta(numero, nome, saldo);
		}
		else if (resposta == 'n') {
			conta = new Conta(numero, nome);
		}
		else {
			System.out.println("Invalid answer!");
		}
		
		System.out.println("Account data: ");
		System.out.printf("Account: %d, Holder: %s, Balance: $%.2f\n", conta.getNumero(), conta.getNome(), conta.getSaldo());
		
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		
		System.out.println("Updated account data: ");
		System.out.printf("Account: %d, Holder: %s, Balance: $%.2f\n", conta.getNumero(), conta.getNome(), conta.getSaldo());
		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		
		System.out.println("Updated account data: ");
		System.out.printf("Account: %d, Holder: %s, Balance: $%.2f\n", conta.getNumero(), conta.getNome(), conta.getSaldo());
		
		sc.close();
	}
}