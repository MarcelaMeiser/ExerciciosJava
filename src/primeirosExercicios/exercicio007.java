package primeirosExercicios;

import java.util.Scanner;

public class exercicio007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 2002, tentativa = 0;
		while (tentativa != senha) {
			System.out.print("Digite a senha: ");
			tentativa = sc.nextInt();
			if (tentativa == senha) {
				System.out.print("Acesso Permitido");
			}
			else {
				System.out.println("Senha Inválida");
			}
		}
		sc.close();
	}
}
