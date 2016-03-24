package pl.wronski.util;

import java.math.BigDecimal;

import pl.wronski.DAO.ProductDAO;
import pl.wronski.exceptions.EmptyCodeBarException;
import pl.wronski.exceptions.NoSuchProductException;
import pl.wronski.model.BarCode;
import pl.wronski.model.Product;

public class BarCodesDecoder {

	public Product decode(BarCode codeBar) throws EmptyCodeBarException,NoSuchProductException{
		if(codeBar == null){
			throw new EmptyCodeBarException();
		}
		
		ProductDAO productDAO = new ProductDAO();
		int potentialProductId = codeBar.getCode();
		Product decodedProduct = new Product("Product "+ potentialProductId, new BigDecimal(potentialProductId * 10));
		
		if(!productDAO.exists(decodedProduct)){
			throw new NoSuchProductException();
		}
		
		return decodedProduct;
	}
}
