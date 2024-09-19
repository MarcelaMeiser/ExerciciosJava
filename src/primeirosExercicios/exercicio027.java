//12 MINUTOS E 30 SEGUNDOS
package primeirosExercicios;

import java.util.Scanner;

public class exercicio027 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i, countM = 0;
		double maior = 0, menor = 0, somaAF = 0, somaF = 0, mediaF = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(i = 0; i < genero.length; i++) {
			System.out.printf("\nAltura da %dª pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %dª pessoa (F/M): ", i + 1);
			genero[i] = sc.next().charAt(0);
			if (genero[i] == 'M') {
				countM += 1;
			}
			else {
				somaAF += altura[i];
				somaF += 1;
			}
		}
		
		for(i = 1; i < genero.length; i++) {
			if(altura[i] < altura[i - 1]) {
				menor = altura[i];
				maior = altura[i - 1];
			}
		}
		
		mediaF = somaAF / somaF;
		
		System.out.printf("\nMenor Altura: %.2f", menor);
		System.out.printf("\nMaior Altura: %.2f", maior);
		System.out.printf("\nMédia das Alturas das mulheres: %.2f", mediaF);
		System.out.printf("\nNúmero de homens: %d", countM);
		
		sc.close();
	}

}
