//5 MINUTOS E 15 SEGUNDOS
package primeirosExercicios;

import java.util.Scanner;

public class exercicio024 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i;
		double soma = 0, media = 0, somaN = 0;
		System.out.println("Quantos elementos vai ter o vetor?");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];
				somaN += 1;
			}
		}
		
		media = (double) soma / somaN;
		
		if (somaN == 0) {
			System.out.println("NENHUM NUMERO PAR DIGITADO");
		}
		else {
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		sc.close();
	}

}
