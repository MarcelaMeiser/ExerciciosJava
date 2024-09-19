package primeirosExercicios;

import java.util.Scanner;

public class exercicio014 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0, i, fatorial = 1;
		System.out.println("Digite um valor: ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		sc.close();
	}

}
