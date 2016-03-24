package pl.wronski.devices;

import pl.wronski.exceptions.EmptyCodeBarException;
import pl.wronski.exceptions.NoSuchProductException;
import pl.wronski.model.BarCode;
import pl.wronski.model.Product;
import pl.wronski.model.Receipt;
import pl.wronski.util.BarCodesDecoder;

public class POSDevice {

	private CodesScanner scanner = new CodesScanner();
	private LCDDisplayScreen lcd = new LCDDisplayScreen();
	private Printer printer = new Printer();
	private BarCodesDecoder decoder = new BarCodesDecoder();
	private Receipt currentReceipt = new Receipt();
	
	public void scan(){
		BarCode codeBar = scanner.scan();
		
		Product product = null;
		try {
			product = decoder.decode(codeBar);
		} catch (EmptyCodeBarException e) {
			lcd.displayError(e.getMessage());
			return;
		} catch (NoSuchProductException e) {
			lcd.displayError(e.getMessage());
			return;
		}
		
		currentReceipt.addProduct(product);
		lcd.displayProduct(product);
	}
	
	public void exit(){
		lcd.displaySumUp(currentReceipt);
		printer.print(currentReceipt);
		currentReceipt = new Receipt();
	}
	
	
}
