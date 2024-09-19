package exercicio005.POO;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return this.grade1 + this.grade2 + this.grade3;
	}
	
	public void situation() {
		if (this.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - this.finalGrade());
		}
		else {
			System.out.println("PASS");
		}
	}
}
