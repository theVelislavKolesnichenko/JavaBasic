package bg.tu_varna.cs;

public class Human implements Animal {
	
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("I am walking using two legs");
	}

	@Override
	public void communicate() {
		// TODO Auto-generated method stub
		System.out.println("I speek");
	}

}
