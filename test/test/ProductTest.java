package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import product.Drink;
import product.Fruit;
import product.Hygiene;
import product.Product;

public class ProductTest {

	Fruit frutilla;
	Hygiene shampooSedal;
	Drink cocaCola;
	Drink cocaZero;
	
	@Before
	public void setup() {
		frutilla = new Fruit("Frutillas", "Kilo", 64.0);
		shampooSedal = new Hygiene("Shampoo Sedal", "500ml", 19.0);
		cocaCola = new Drink("Coca-Cola", "1.5", 18.0);
		cocaZero = new Drink("Coca-Cola Zero", "1.5", 20.0);
	}
	
	/*
	 * Se encarga de testear que la lista de Prodcuts 
	 * quede correctamente ordenada por precio para 
	 * luego poder obtener el primer y el ultimo Product
	 * y de esa manera tener el mas caro y el mas barato.
	 * */
	
	@Test
	public void orderProductForCostTest() {
		List<Product> products = Arrays.asList(frutilla, shampooSedal, cocaCola, cocaZero);
		List<Product> expected = Arrays.asList(cocaCola, shampooSedal, cocaZero, frutilla);
		
		assertNotEquals(expected, products);
		Collections.sort(products);
		
		assertEquals(expected, products);
	}

}
