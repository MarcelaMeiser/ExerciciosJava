package exercicio006.POO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought: ");
		double dollar = sc.nextDouble();
		
		CurrencyConverter.totalPrice(price, dollar);
		
		sc.close();
	}

}
