package bg.tu_varna.cs.tvshop;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		TVShop shop = new TVShop("F:\\DevRepository\\JavaBasics\\ExampleProjects\\TVShop\\file.txt");
		
		System.out.println(shop);
		
		System.out.println(shop.maxSalesByManufacturers());
		
		System.out.println(shop.maxSalesBySize());
	}

}
