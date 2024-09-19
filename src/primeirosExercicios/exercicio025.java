//7 MINUTOS E 30 SEGUNDOS
package primeirosExercicios;

import java.util.Scanner;

public class exercicio025 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int i, n = 0;
		String aux = null;
		
		System.out.print("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(i = 0; i < nome.length; i++) {
			System.out.printf("Dados da %dª pessoa: \n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		for(i = 1; i < nome.length; i++) {
			if (idade[i] > idade[i - 1]) {
				aux = nome[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + aux);
		
		sc.close();
	}

}
