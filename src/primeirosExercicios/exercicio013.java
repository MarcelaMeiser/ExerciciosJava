package primeirosExercicios;

import java.util.Scanner;

public class exercicio013 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0, i, x = 0, y = 0;
		float divisao = 0;
		System.out.print("Quantidade de duplas: ");
		n = sc.nextInt();
		for(i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			System.out.print("Digite outro número: ");
			y = sc.nextInt();
			if(y != 0) {
				divisao = (float) x / y;
				System.out.println(divisao);
			}
			else {
				System.out.println("Divisão Impossível");
			}
		}
		sc.close();
	}

}

