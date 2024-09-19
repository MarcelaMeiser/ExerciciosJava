package primeirosExercicios;

import java.util.Scanner;

public class exercicio020 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i, soma = 0, somaPares = 0;
		
		System.out.println("Digite quantos números você vai digitar: ");
		n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for(i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
			soma += 1;
		}
		
		System.out.print("NUMEROS PARES:\n");
		for(i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + "  ");
				somaPares += 1;
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES: " + somaPares);
		sc.close();
	}

}
