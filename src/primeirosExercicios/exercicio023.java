//3 MINUTOS E 50 SEGUNDOS
package primeirosExercicios;

import java.util.Scanner;

public class exercicio023 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i;
		double soma = 0, media = 0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		media = (double) soma / n;
		
		System.out.printf("MÉDIA DOS VETORES: %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
