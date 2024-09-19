package primeirosExercicios;

import java.util.Scanner;

public class exercicio008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1, y = 1;
		while (x != 0 && y != 0) {
			System.out.print("x = ");
			x = sc.nextInt();
			System.out.print("y = ");
			y = sc.nextInt();
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x > 00 && y < 0) {
					System.out.println("Quarto");
				}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
		}
		sc.close();
	}
}
