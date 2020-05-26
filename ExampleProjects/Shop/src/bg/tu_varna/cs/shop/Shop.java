package bg.tu_varna.cs.shop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Shop implements ShopReader {

	private final String filename = "F:\\DevRepository\\JavaBasics\\ExampleProjects\\Shop\\src\\data.txt";
	
	private HashSet<Stock> stocks;
	
	public Shop() {
		stocks = new HashSet<Stock>();
	}
	
	public String getManufacturerWithMaxStock() {
		
		Map<String, Integer> manToCount = new HashMap<String, Integer>();
		
		for (Stock stock : stocks) {
			if(manToCount.containsKey(stock.getManufacturer() )) {
				int count = manToCount.get(stock.getManufacturer());
				count += stock.getCount();
				manToCount.put(stock.getManufacturer(), count);
			} else {
				manToCount.put(stock.getManufacturer(), stock.getCount());
			}
		}
		
		int max = Collections.max(manToCount.values());
		
		StringBuilder result = new StringBuilder();
		
		for (String name : manToCount.keySet()) {
			if(manToCount.get(name) == max) {
				result.append(name);
				result.append(" ");
			}
		}
		
		return result.toString();
	}
	
	public String getStockWithMaxFrequency() {
		
		float max = Integer.MIN_VALUE;
		
		for (Stock stock : stocks) {
			if(stock instanceof InternalComponent) {
				InternalComponent internal = (InternalComponent) stock;
				if(max < internal.getFrequency()) {
					max = internal.getFrequency();
				}
			}
		}
		
		return Float.toString(max);
	}
	
	public String getStockWithMaxFrequency2() {
		
		ArrayList<Float> frequency = new ArrayList<Float>();
		
		for (Stock stock : stocks) {
			if(stock instanceof InternalComponent) {
				InternalComponent internal = (InternalComponent) stock;
				frequency.add(internal.getFrequency());
			}
		}
		
		float max = Collections.max(frequency);
		
		return Float.toString(max);
	}

	public String getStockWithMaxFrequency3() {
		
		ArrayList<InternalComponent> frequency = new ArrayList<InternalComponent>();
		
		for (Stock stock : stocks) {
			if(stock instanceof InternalComponent) {
				InternalComponent internal = (InternalComponent) stock;
				frequency.add(internal);
			}
		}
		
		InternalComponent max = Collections.max(frequency);
		
		return Float.toString(max.getFrequency());
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		for (Stock stock : stocks) {
			result.append(stock);
		}
		
		return result.toString();
	}
	
	@Override
	public void readShopData() throws IOException {

		FileReader reader = new FileReader(filename);
		BufferedReader buffer = new BufferedReader(reader);
		
		String line;
		while ((line = buffer.readLine()) != null) {
			String[] words = line.split("\\s+");
			//words[0] -> type
			//words[1] -> manufacturer
			//words[2] -> count
			//words[3] -> price
			//words[4] -> additional
			Stock stock = null;
			int count = Integer.parseInt(words[2]);
			double price = Double.parseDouble(words[3]);
			
			if(words[0].equals("type1")) {
				float frequency = Float.parseFloat(words[4]);
				stock = new InternalComponent(words[1], count, price, frequency);	
			} else if(words[0].equals("type2")) {
				int inch = Integer.parseInt(words[4]);
				stock = new ExternalComponent(words[1], count, price, inch);
			}
			
			if(stock != null) {
				stocks.add(stock);
			}
		}
	}
}
