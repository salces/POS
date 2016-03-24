import java.math.BigDecimal;

import pl.wronski.DAO.ProductDAO;
import pl.wronski.devices.POSDevice;
import pl.wronski.model.Product;

public class Main {
	
	
	
	public static void main(String[] args) {
		POSDevice pos = new POSDevice();
		for(int i =0; i < 10; i++){
			pos.scan();
		}
		pos.exit();
	}

}
