//6 MINUTOS
package primeirosExercicios;

import java.util.Scanner;

public class exercicio022 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for(i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		System.out.println("VETOR RESULTANTE: ");
		for(i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}
		
		
		sc.close();
	}

}
