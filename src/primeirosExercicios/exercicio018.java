package primeirosExercicios;

import java.util.Scanner;

public class exercicio018 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i;
		double soma = 0, media = 0;
		
		System.out.print("Digite quantos números você vai digitar: ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		media = soma / vect.length;
		
		System.out.print("VALORES= ");		
		for(i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		System.out.printf("\nSOMA = %.2f\nMEDIA = %.2f", soma, media);
		
		sc.close();
	}

}
