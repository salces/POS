package pl.wronski.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import pl.wronski.model.Product;

public class DataSource {

	List<Product> allProductsFromDB = new ArrayList<>();

	private DataSource() {
		for (int i = 0; i < 8; i++) {
			allProductsFromDB.add(new Product("Product " + i, new BigDecimal(10 * i)));
		}
	}

	public List<Product> getProductList() {
		return this.allProductsFromDB;
	}

	public static DataSource getInstance() {
		return Holder.INSTANCE;
	}

	private static class Holder {
		private final static DataSource INSTANCE = new DataSource();
	}

}
