package exercicio007.POO;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		this.saldo = saldo + deposito;
	}
	
	public void saque(double saque) {
		this.saldo = saldo - saque - 5;
	}
}
