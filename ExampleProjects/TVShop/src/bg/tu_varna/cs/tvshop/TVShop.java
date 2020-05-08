package bg.tu_varna.cs.tvshop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TVShop implements TVShopReader {

	private String filename;
	private List<TV> tvs;
	
	public TVShop(String filename) throws IOException {
		this.filename = filename;
		readShopData();
	}
	
	@Override
	public String toString() {
		return Arrays.toString(tvs.toArray());
	}

	@Override
	public void readShopData() throws IOException {
		FileReader fileReader = new FileReader(filename);
		BufferedReader reader = new BufferedReader(fileReader);
		
		ArrayList<TV> tvs = new ArrayList<TV>();
		
		String line;
		while ((line = reader.readLine()) != null) {
			String[] words = line.split("\\s+");
			for(int i = 0; i <= words.length / 2; i+=2) {
				String manufacturer = words[i];
				int inch = Integer.parseInt(words[i + 1]);
				TV tv = new TV(manufacturer, inch);
				tvs.add(tv);
			}
		}
		
		reader.close();
		
		this.tvs = tvs;
	}
	
	public String maxSalesByManufacturers() {
		// LG, Sony, Samsung, Philips, LG, Sony, Samsung, Philips
		
		// Manufacturer, sales
		
		//manufacturers[LG] = 2
		//manufacturers[Sony] = 2
		//manufacturers[Samsung] = 2
		//manufacturers[Philips] = 2
	
		// 2 {LG Sony Samsung Philips}
		
		Map<String, Integer> manufacturerToSales = new HashMap<String, Integer>();
		
		for(TV tv : tvs) {
			
			String manufacturer = tv.getManufacturer();
			
			if(manufacturerToSales.containsKey(manufacturer)) {
				int sales = manufacturerToSales.get(manufacturer);
				
				manufacturerToSales.put(manufacturer, sales+1);
			} else {
				manufacturerToSales.put(manufacturer, 1);
			}
		}
		
		int max = Collections.max(manufacturerToSales.values());
		
		/*int max = 0;
		
		for (int i : manufacturerToSales.values()) {
			if(i > max) { 
				max = i;
			}
		}*/
		
		ArrayList<String> manName = new ArrayList<String>();
		for (String name : manufacturerToSales.keySet()) {
			if(manufacturerToSales.get(name) == max) {
				manName.add(name);
			}
		}
				
		return max + Arrays.toString(manName.toArray());		
	}

	public String maxSalesBySize() {
		Map<Integer, Integer> inchToSales = new HashMap<Integer, Integer>();
		
		for(TV tv : tvs) {
			
			int inch = tv.getInch();
			
			if(inchToSales.containsKey(inch)) {
				int sales = inchToSales.get(inch);
				
				inchToSales.put(inch, sales+1);
			} else {
				inchToSales.put(inch, 1);
			}
		}
		
		int max = Collections.max(inchToSales.values());
		
		/*int max = 0;
		for (int i : inchToSales.values()) {
			if(i > max) { 
				max = i;
			}
		}*/
		
		ArrayList<Integer> inchs = new ArrayList<Integer>();
		for (int inch : inchToSales.keySet()) {
			if(inchToSales.get(inch) == max) {
				inchs.add(inch);
			}
		}
				
		return max + Arrays.toString(inchs.toArray());	
	}

	public void printStringNull(String[] str) {
		for (String s : str) {
			if(s == null) {
				System.out.print("Empty String");
			}
		}
	}
	
	public void printIntegerNull(int[] str) {
		for (int s : str) {
			if(s == 0) {
				System.out.print("Empty int");
			}
		}
	}
	
}
