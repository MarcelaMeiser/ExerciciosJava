package exercicio008.POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos funcionários serão registrados: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.print("\nEmployee #" + (i + 1) + ": ");
			System.out.print("\nId: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("\nDigite o id do funcionário que terá o salário incrementado: ");
		int idSalary = sc.nextInt();
		
		Integer pos = position(list, idSalary);
		if (pos == -1) {
			System.out.println("Esse Id não existe");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println("Lista de funcionários: \n");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static int position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

}
