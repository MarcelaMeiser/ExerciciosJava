package primeirosExercicios;

import java.util.Scanner;

public class exercicio028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.print("Digite a medida da matriz (Linha/Coluna): ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Digite os números da matriz: ");
		
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
				mat[i][j] = sc.nextInt();				
			}
			System.out.println(" ");
		}
		
		System.out.println("Diagonal Principal: ");
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) {
					System.out.print(mat[i][j] + "  ");
				}
				if(mat[i][j] < 0) {
					count += 1;
				}
			}
		}
		
		System.out.print("\nNúmeros Negativos: ");
		System.out.print(count);
		
		sc.close();
	}

}
