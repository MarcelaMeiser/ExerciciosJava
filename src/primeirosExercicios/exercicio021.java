package primeirosExercicios;

import java.util.Scanner;

public class exercicio021 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i, pos = 0;
		double aux = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		for(i = 1; i < vetor.length; i++) {
			if (vetor[i] > vetor[i - 1]) {
				aux = vetor[i];
				pos = i;
			}
		}
		
		System.out.print("MAIOR VALOR: ");
		System.out.println(aux);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + pos);
		
		sc.close();
	}

}
