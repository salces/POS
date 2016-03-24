package pl.wronski.exceptions;

public class EmptyCodeBarException extends Exception{
	
	public EmptyCodeBarException() {
		super("Invalid bar-code");
	}
}
