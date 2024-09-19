package primeirosExercicios;

import java.util.Scanner;

public class exercicio016 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0, i;
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			System.out.printf("%d  %d  %d\n", i, i * i, i * i * i);
		}
		sc.close();
	}

}
