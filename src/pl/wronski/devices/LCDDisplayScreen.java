package pl.wronski.devices;

import pl.wronski.model.Product;
import pl.wronski.model.Receipt;

public class LCDDisplayScreen {

	public void displayProduct(Product p) {
		System.out.println(p);
	}

	public void displayError(String s) {
		System.out.println(s);
	}

	public void displaySumUp(Receipt r) {
		System.out.println("Total sum:" + r.getSum());
	}

}
