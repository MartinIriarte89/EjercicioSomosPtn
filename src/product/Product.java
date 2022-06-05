package product;

import java.util.Objects;

public class Product implements Comparable<Product> {

	protected static final String SEPARATOR = " /// ";
	protected static final String SYMBOL = "$";
	private String name;
	private String quantity;
	private Double price;

	public Product(String name, String quantity, Double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getPrice() {
		if (this.price.toString().endsWith(".0")) {
			return String.valueOf(this.price.intValue());
		}
		return this.price.toString();
	}

	@Override
	public int compareTo(Product o) {
		return this.price.compareTo(o.price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(quantity, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(quantity, other.quantity) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price);
	}

}
