//5 MINUTOS
package primeirosExercicios;

import java.util.Scanner;

public class exercicio026 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int i, n = 0;
		
		System.out.print("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		
		String[] aluno = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];
		
		for(i = 0; i < aluno.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do aluno %d:\n", i + 1);
			sc.nextLine();
			aluno[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			media[i] = (double) (nota1[i] + nota2[i]) / 2;
		}
		
		System.out.println("ALUNOS APROVADOS: ");
		for(i = 0; i < aluno.length; i++) {
			if(media[i] >= 6.0) {
				System.out.println(aluno[i]);
			}
		}
		
		sc.close();
	}

}
