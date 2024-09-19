package primeirosExercicios;

import java.util.Scanner;

public class exercicio015 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0, i;
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
