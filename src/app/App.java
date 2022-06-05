package app;

import java.util.Arrays;

import console.Console;
import product.Drink;
import product.Fruit;
import product.Hygiene;

public class App {

	public static void main(String[] args) {

		Console console = new Console();

		Fruit frutilla = new Fruit("Frutillas", "Kilo", 64.0);
		Hygiene shampooSedal = new Hygiene("Shampoo Sedal", "500ml", 19.0);
		Drink cocaCola = new Drink("Coca-Cola", "1.5", 18.0);
		Drink cocaZero = new Drink("Coca-Cola Zero", "1.5", 20.0);

		console.execution(Arrays.asList(cocaZero, cocaCola, shampooSedal, frutilla));
	}
}
