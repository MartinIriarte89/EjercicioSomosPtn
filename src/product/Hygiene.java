package product;

public class Hygiene extends Product {

	public Hygiene(String name, String quantity, Double price) {
		super(name, quantity, price);
	}

	@Override
	public String toString() {
		return "Nombre: " + getName() + SEPARATOR + "Contenido: " + getQuantity() + SEPARATOR + "Precio: "
				+ SYMBOL + getPrice();
	}
}
