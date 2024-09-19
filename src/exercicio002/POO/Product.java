package exercicio002.POO;
public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalInStock() {
		return price * quantity;
	}
	public void addProduct(int quantAdd) {
		this.quantity = quantity + quantAdd;
	}
	public void removeProduct(int quantRemove) {
		this.quantity = quantity - quantRemove;
	}
	public void showInformations() {
		double totalInStock = price * quantity;
		System.out.printf("%s, $%.2f, %d units, Total: $%.2f\n", this.name, this.price, this.quantity, totalInStock);
	}
}
