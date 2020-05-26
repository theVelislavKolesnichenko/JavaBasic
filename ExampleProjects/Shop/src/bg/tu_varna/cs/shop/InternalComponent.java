package bg.tu_varna.cs.shop;

public class InternalComponent extends Stock {
	
	private float frequency;
	
	public InternalComponent() {
		this("", 0, 0, 0);
	}
	
	public InternalComponent(String manufactorer, int count, double price, float frequency) {
		super(manufactorer, count, price);
		this.frequency = frequency;
	}
	
	public float getFrequency() {
		return frequency;
	}
	
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	
	@Override
	public String toString() {
		return "type1 " + 
				this.getManufacturer() + " " + 
				this.getCount() + " " +
				this.getPrice() + " " +
				this.getFrequency() + "\n";
	}
	
	@Override
	public int compareTo(Stock o) {
		InternalComponent internalComponent = (InternalComponent) o;
		
		Float f = this.frequency;
		Float f1 = internalComponent.frequency;
		return f.compareTo(f1);
	}
}
