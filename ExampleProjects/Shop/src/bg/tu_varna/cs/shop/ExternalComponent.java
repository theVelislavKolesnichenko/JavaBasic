package bg.tu_varna.cs.shop;

public class ExternalComponent extends Stock {

	private int inch;
	
	public ExternalComponent() {
		this("", 0, 0, 0);
	}
	
	public ExternalComponent(String manufactorer, int count, double price, int inch) {
		super(manufactorer, count, price);
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	@Override
	public String toString() {
		return "type2 " +
				this.getManufacturer() + " " +
				this.getCount() + " " +
				this.getPrice() + " " +
				this.getInch() + "\n";
	}
}
