package primeirosExercicios;

import java.util.Scanner;

public class exercicio006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0, c = 0, areaTriangulo = 0, areaCirculo = 0, areaTrapezio = 0, areaQuadrado = 0, areaRetangulo = 0;
		System.out.println("A = ");
		a = sc.nextDouble();
		System.out.println("B = ");
		b = sc.nextDouble();
		System.out.println("C = ");
		c = sc.nextDouble();
		areaTriangulo = (double) (a * c) / 2;
		areaCirculo = (double) 3.14159 * (c * c);
		areaTrapezio = ((a + b) * c) / 2;
		areaQuadrado = b * b;
		areaRetangulo = a * b;
		System.out.printf("ÁREA TRIÂNGULO = %.3f\nÁREA CÍRCULO = %.3f\nÁREA TRAPÉZIO = %.3f\nÁREA QUADRADO = %.3f\nÁREA RETÂNGULO = %.3f", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
		sc.close();
	}

}
