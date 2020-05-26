package bg.tu_varna.cs.shop;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Shop shop = new Shop();
		
		try {
			shop.readShopData();
		} catch (IOException e) {
			System.out.println("try again");
			return;
		}
		
		System.out.println(shop);
		
		System.out.println(shop.getManufacturerWithMaxStock());
		
		System.out.println(shop.getStockWithMaxFrequency());
		
	}

}
