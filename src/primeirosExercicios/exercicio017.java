package primeirosExercicios;

import java.util.Scanner;

public class exercicio017 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i;
		
		System.out.print("Digite a quantidade de números que você vai digitar: ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS");
		
		for(i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
