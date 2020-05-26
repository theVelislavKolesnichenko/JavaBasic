package bg.tu_varna.cs.shop;

class Stock implements Comparable<Stock> {

	private String manufacturer;
	private int count;
	private double price;
	
	public Stock() {
		this("", 0, 0);
	}
	
	public Stock(String manufacturer, int count, double price) {
		this.manufacturer = manufacturer;
		this.count = count;
		this.price = price;
	}
	
	public Stock(String manufacturer) {
		this(manufacturer, 0, 0);
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Stock o) {

		Integer count1 = this.count;		
		Integer count2 = o.getCount();
		
		return count1.compareTo(count2);
		
		/*if(this.count > o.getCount()) {
			return -1;
		} else if(this.count < o.getCount()) {
			return 1;
		} else {
			return 0;
		}*/
	}

	@Override
	public boolean equals(Object obj) {
		Stock stock = (Stock) obj;
		
		boolean equalMan = this.manufacturer.equals(stock.getManufacturer());
		boolean equalCount = this.count == stock.getCount();
		boolean equalPrice = this.price == stock.getPrice();
		
		return equalMan && equalCount && equalPrice;
	}
	
	@Override
	public String toString() {
		return "Manufacturer : " + this.getManufacturer() + 
				"Count : " + this.getCount() + 
				"Price : " + this.getPrice() + "\n";
	}
	
	@Override
	public int hashCode() {
		return this.getManufacturer().hashCode() + 
				Integer.hashCode(this.getCount()) +
				Double.hashCode(this.getPrice());
	}
	
}
