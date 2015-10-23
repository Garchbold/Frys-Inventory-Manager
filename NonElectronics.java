package frys;

import java.util.LinkedList;

public abstract class NonElectronics extends FrysProducts{


	LinkedList<NonElectronics> Inventory = new LinkedList<NonElectronics>();

	NonElectronics(String name, double price, boolean sale, int stock) {
		this.name=name;

		this.price = price;

		this.sale = sale;

		this.numInStock = stock;

	}

}
