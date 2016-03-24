package pl.wronski.exceptions;

public class NoSuchProductException extends Exception {
	
	public NoSuchProductException() {
	        super("Product not found");
	    }
}
