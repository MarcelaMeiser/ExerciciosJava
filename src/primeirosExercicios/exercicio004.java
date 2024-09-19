package primeirosExercicios;

import java.util.Scanner;

public class exercicio004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, horas = 0;
		float pagamento = 0, salario = 0;
		System.out.println("Digite o número do funcionário: ");
		numero = sc.nextInt();
		System.out.println("Digite o valor pago por hora: ");
		pagamento = sc.nextFloat();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		salario = horas * pagamento;
		System.out.printf("Número do funcionário: %d\nSalário: R$%.2f", numero, salario);
		sc.close();
	}

}
