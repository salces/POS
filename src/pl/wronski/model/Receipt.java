package pl.wronski.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
	private List<Product> products;
	private BigDecimal sum;
	
	public Receipt(){
		products = new ArrayList<>();
		sum = new BigDecimal("0");
	}
	
	public void addProduct(Product p){
		products.add(p);
		sum = sum.add(p.getPrice());
	}

	public List<Product> getProducts() {
		return products;
	}

	public BigDecimal getSum() {
		return sum;
	}
	
	
	
}
