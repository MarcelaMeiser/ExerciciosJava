package primeirosExercicios;

import java.util.Scanner;

public class exercicio009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0, escolha = 0;
		while (escolha != 4) {
			System.out.print("Escolha: ");
			escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				alcool += 1;
				break; 
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
