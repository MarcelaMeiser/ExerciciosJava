package exercicio001.POO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 double areaX = 0, areaY = 0;
		 Triangle x = new Triangle();
		 Triangle y = new Triangle();
		 
		 System.out.println("Enter the measures of triangle X; ");
		 System.out.print("Lado a: ");
		 x.a = sc.nextDouble();
		 System.out.print("Lado b: ");
		 x.b = sc.nextDouble();
		 System.out.print("Lado c: ");
		 x.c = sc.nextDouble();
		 System.out.println("Enter the measures of triangle Y: ");
		 System.out.println("Lado a: ");
		 y.a = sc.nextDouble();
		 System.out.println("Lado b: ");
		 y.b = sc.nextDouble();
		 System.out.println("Lado c: ");
		 y.c = sc.nextDouble();
		 
		 areaX = x.area();
		 
		 areaY = y.area();
		 
		 if (areaX > areaY) {
			 System.out.println("Larger area: X");
		 }
		 else {
			 System.out.println("Larger area: Y");
		 }
		 
		 sc.close();
	}

}
