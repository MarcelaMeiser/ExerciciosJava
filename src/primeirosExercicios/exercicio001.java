package primeirosExercicios;

import java.util.Scanner;

public class exercicio001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0, z = 0;
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		System.out.println("Digite outro número: ");
		y = sc.nextInt();
		z = x + y;
		System.out.println("SOMA = " + z);
		sc.close();
	}

}
