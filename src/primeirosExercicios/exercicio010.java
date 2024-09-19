package primeirosExercicios;

import java.util.Scanner;

public class exercicio010 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = 0, i;
		System.out.print("Digite um número de 1 a 1000: ");
		x = sc.nextInt();
		for(i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
