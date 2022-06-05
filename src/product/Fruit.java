package product;

public class Fruit extends Product {

	public Fruit(String name, String quantity, Double price) {
		super(name, quantity, price);
	}

	@Override
	public String toString() {
		return "Nombre: " + getName() + SEPARATOR + "Precio: " + SYMBOL + getPrice() + SEPARATOR + "Unidad de venta: "
				+ getQuantity();
	}

}
