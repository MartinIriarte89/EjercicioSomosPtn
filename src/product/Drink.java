package product;

public class Drink extends Product {

	public Drink(String name, String quantity, Double price) {
		super(name, quantity, price);
	}

	@Override
	public String toString() {
		return "Nombre: " + getName() + SEPARATOR + "Litros: " + getQuantity() + SEPARATOR + "Precio: " + SYMBOL
				+ getPrice();
	}
}
