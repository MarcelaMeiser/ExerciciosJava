package exercicio004.POO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee x = new Employee();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $%.2f\n", x.name, x.netSalary());
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		x.IncreaseSalary(percentage);
		
		System.out.print("Updated data: ");
		x.showInformations();
		sc.close();
	}

}
