package exercicio003.POO;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return (height * 2) + (width * 2);
	}
	public double diagonal() {
		return Math.sqrt((height * height) + (width * width));
	}
}
