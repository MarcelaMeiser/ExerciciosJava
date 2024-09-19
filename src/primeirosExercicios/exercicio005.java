package primeirosExercicios;

import java.util.Scanner;

public class exercicio005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cp1 = 0, qp1 = 0, cp2 = 0, qp2 = 0;
		float vp1 = 0, vp2 = 0, total = 0;
		System.out.print("Código peça 1: ");
		cp1 = sc.nextInt();
		System.out.print("Quantidade peça 1: ");
		qp1 = sc.nextInt();
		System.out.print("Preço peça 1: ");
		vp1 = sc.nextFloat();
		System.out.print("Código peça 2: ");
		cp2 = sc.nextInt();
		System.out.print("Quantidade peça 2: ");
		qp2 = sc.nextInt();
		System.out.print("Preço peça 2: ");
		vp2 = sc.nextFloat();
		total = (qp1 * vp1) + (qp2 * vp2);
		System.out.printf("PRODUTOS DE CÓDIGO: %d e %d\n", cp1, cp2);
		System.out.println("TOTAL A PAGAR: R$" + String.format("%.2f", total));
		sc.close();
	}

}
