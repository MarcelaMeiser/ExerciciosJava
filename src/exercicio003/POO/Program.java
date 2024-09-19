package exercicio003.POO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle x = new Rectangle();
		
		System.out.print("Enter rectangle width and height: ");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();
		
		System.out.printf("Area = %.2f\n", x.area());
		System.out.printf("Perimeter = %.2f\n", x.perimeter());
		System.out.printf("Diagonal = %.2f\n", x.diagonal());
	
		sc.close();
	}

}
