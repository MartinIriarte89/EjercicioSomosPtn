package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import console.Console;
import product.Drink;
import product.Fruit;
import product.Hygiene;
import product.Product;

public class ConsoleTest {

	Fruit frutilla;
	Hygiene shampooSedal;
	Drink cocaCola;
	Drink cocaZero;
	Console console;
	ByteArrayOutputStream newSystemOut;
	String outputExpected;

	@Before
	public void setup() {
		console = new Console();
		newSystemOut = new ByteArrayOutputStream();

		frutilla = new Fruit("Frutillas", "Kilo", 64.0);
		shampooSedal = new Hygiene("Shampoo Sedal", "500ml", 19.0);
		cocaCola = new Drink("Coca-Cola", "1.5", 18.0);
		cocaZero = new Drink("Coca-Cola Zero", "1.5", 20.0);

		outputExpected = "Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20\r\n"
				+ "Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18\r\n"
				+ "Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19\r\n"
				+ "Nombre: Frutillas /// Precio: $64 /// Unidad de venta: Kilo\r\n"
				+ "=============================\r\n" 
				+ "Producto más caro: Frutillas\r\n"
				+ "Producto más barato: Coca-Cola\r\n";
	}

	@Test
	public void consoleExecutionTest() {
		System.setOut(new PrintStream(newSystemOut));
		List<Product> products = Arrays.asList(cocaZero, cocaCola, shampooSedal, frutilla);
		console.execution(products);

		String outputObteined = newSystemOut.toString();

		assertEquals(outputExpected, outputObteined);
	}

}
