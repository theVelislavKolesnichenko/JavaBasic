package bg.tu_varna.cs.tvshop;

class TV implements Comparable<TV> {

	private String manufacturer;
	private int inch;
	
	public TV(String manufacturer, int inch) {
		this.manufacturer = manufacturer;
		this.inch = inch;
	}
	
	public TV(int inch) {
		this("", inch);
	}
	
	public TV() {
		this("", 0);
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public int compareTo(TV o) {
		if(this.getInch() == o.getInch())
			return 0;
		else if(this.getInch() < o.getInch())
			return -1;
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		TV tv = (TV)obj;
		return this.getManufacturer().equals(tv.getManufacturer()) && 
				this.getInch() == getInch();
	}

	@Override
	public String toString() {
		return "TV [ Manufacturer:" + this.getManufacturer() 
		+ "; inch:" + this.getInch() + "]";
	}
	
}
