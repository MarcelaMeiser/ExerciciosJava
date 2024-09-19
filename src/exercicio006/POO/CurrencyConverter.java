package exercicio006.POO;

public class CurrencyConverter {
	public static final double IOF = 1.06;
	
	public static void totalPrice(double price, double dollar) {
		System.out.printf("Amount to be paid in reais = R$%.2f", price * dollar * IOF);
	}
}
