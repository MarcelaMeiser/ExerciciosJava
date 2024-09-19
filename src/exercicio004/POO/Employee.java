package exercicio004.POO;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void IncreaseSalary(double percentage) {
		this.grossSalary = grossSalary * (1 + (percentage / 100));
	}
	public void showInformations() {
		System.out.println(this.name + ", $" + String.format("%.2f", netSalary()));
	}
}
