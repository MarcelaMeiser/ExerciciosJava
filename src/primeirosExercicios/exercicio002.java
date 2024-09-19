package primeirosExercicios;

import java.util.Scanner;

public class exercicio002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float raio = 0, area = 0;
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextFloat();
		area = (float) 3.14159 * (raio * raio);
		System.out.println("AREA = " +  String.format("%.4f", area));
		sc.close();
	}
}
