package primeirosExercicios;

import java.util.Scanner;

public class exercicio011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, i, somaIn = 0, somaOut = 0, x = 0;
		System.out.print("Digite a quantidade de números que serão digitados: ");
		n = sc.nextInt();
		sc.close();
		for(i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				somaIn += 1;
			}
			else {
				somaOut += 1;
			}
		}
		System.out.println("In: " + somaIn);
		System.out.println("Out: " + somaOut);
		sc.close();
	}

}
