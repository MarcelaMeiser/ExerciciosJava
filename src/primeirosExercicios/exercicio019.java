package primeirosExercicios;

import java.util.Scanner;

public class exercicio019 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i;
		double soma = 0, soma16 = 0, media = 0, porcentagem = 0;
		
		System.out.print("Digite a quantidade de pessoas: ");
		n = sc.nextInt();
		
		int[] idade = new int[n];
		String[] nome = new String[n];
		double[] altura = new double[n];
		
		for(i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			soma = soma + altura[i];
			if (idade[i] < 16) {
				soma16 += 1;
			}
		}
		porcentagem = (soma16 * 100) / idade.length;
		media = soma / n;
		
		System.out.printf("Altura média: %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
		for(i = 0; i < nome.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
