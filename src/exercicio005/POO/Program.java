package exercicio005.POO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student x = new Student();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Grade 1: ");
		x.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		x.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		x.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", x.finalGrade()));
		x.situation();
		
		sc.close();
	}

}
