package pl.wronski.DAO;

import java.util.List;

import pl.wronski.model.Product;

public class ProductDAO {
	
	
	public boolean exists(Product product){
		List<Product> products = DataSource.getInstance().getProductList();
		return products.contains(product);
	}
	
	public List<Product> getProductList(){
		List<Product> products = DataSource.getInstance().getProductList();
		return products;
	}
}
