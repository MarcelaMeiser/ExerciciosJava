package primeirosExercicios;

import java.util.Scanner;

public class exercicio003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0, d = 0, diferenca = 0;
		System.out.println("A = ");
		a = sc.nextInt();
		System.out.println("B = ");
		b = sc.nextInt();
		System.out.println("C = ");
		c = sc.nextInt();
		System.out.println("D = ");
		d = sc.nextInt();
		diferenca = (a * b) - (c * d);
		System.out.println("DIFERENÇA = " + diferenca);
		sc.close();
	}

}
