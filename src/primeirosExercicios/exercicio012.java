package primeirosExercicios;

import java.util.Scanner;

public class exercicio012 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i, n = 0;
		float media = 0, x = 0, y = 0, z = 0;
		System.out.print("Digite o número de casos de teste: ");
		n = sc.nextInt();
		for(i = 0; i < n; i++) {
			System.out.print("Primeiro Valor: ");
			x = sc.nextFloat();
			System.out.print("Segundo Valor: ");
			y = sc.nextFloat();
			System.out.print("Terceiro Valor: ");
			z = sc.nextFloat();
			
			media = ((x * 2) + (y * 3) + (z * 5)) / 10;
			
			System.out.println("Media = " + String.format("%.1f", media));
		}
		sc.close();
	}

}
