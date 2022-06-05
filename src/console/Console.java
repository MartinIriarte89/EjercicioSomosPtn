package console;

import java.util.Collections;
import java.util.List;

import product.Product;

public class Console {

	private static final String UNDERLINED = "=============================";
	private static final String EXPENSIVE_PRODUCT = "Producto más caro: ";
	private static final String CHEAP_PRODUCT = "Producto más barato: ";

	public void execution(List<Product> products) {
		products.stream().forEach(product -> System.out.println(product));
		System.out.println(UNDERLINED);
		Collections.sort(products);
		System.out.println(EXPENSIVE_PRODUCT + products.get(products.size() - 1).getName());
		System.out.println(CHEAP_PRODUCT + products.get(0).getName());
	}
}
