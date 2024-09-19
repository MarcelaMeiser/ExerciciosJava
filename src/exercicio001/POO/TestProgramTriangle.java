package exercicio001.POO;

import java.util.Scanner;

public class TestProgramTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double xA = 0, xB = 0, xC = 0;
		double yA = 0, yB = 0, yC = 0;
		double xP = 0, yP = 0;
		double areaX = 0, areaY = 0;
		
		System.out.println("Medidas do Triângulo X:");
		System.out.print("lado a: ");
		xA = sc.nextDouble();
		System.out.print("lado b: ");
		xB = sc.nextDouble();
		System.out.print("lado c: ");
		xC = sc.nextDouble();
		System.out.println("Medidas do Triângulo Y:");
		System.out.print("lado a: ");
		yA = sc.nextDouble();
		System.out.print("lado b: ");
		yB = sc.nextDouble();
		System.out.print("lado c: ");
		yC = sc.nextDouble();
		
		xP = (xA + xB + xC) / 2;
		yP = (yA + yB + yC) / 2;
		
		areaX = Math.sqrt(xP*(xP - xA)*(xP - xB)*(xP - xC));
		areaY = Math.sqrt(yP*(yP - yA)*(yP - yB)*(yP - yC));
		
		System.out.println("Área do Triângulo X: " + String.format("%.4f", areaX));
		System.out.println("Área do Triângulo Y: " + String.format("%.4f", areaY));
		
		if (areaX > areaY) {
			System.out.println("Maior área do triângulo X: " + String.format("%.4f", areaX));
		}
		else {
			System.out.println("Maior área do triângulo Y: " + String.format("%.4f", areaY));
		}
		
		sc.close();
	}

}
