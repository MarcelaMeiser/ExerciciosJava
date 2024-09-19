package exercicio002.POO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product x = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Price: ");
		x.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		x.quantity = sc.nextInt();
		
		System.out.print("Product data: ");
		x.showInformations();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantAdd = sc.nextInt();
		
		x.addProduct(quantAdd);
		
		System.out.print("Update data: ");
		x.showInformations();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int quantRemove = sc.nextInt();
		
		x.removeProduct(quantRemove);
		
		System.out.print("Update data: ");
		x.showInformations();
		
		sc.close();
		
	}
}
