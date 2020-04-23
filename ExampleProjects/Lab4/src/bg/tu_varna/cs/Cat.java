package bg.tu_varna.cs;

public abstract class Cat implements Animal {
	
	@Override
	public void move() {
		System.out.println("I am walking on 4 toes.");
	}
	
	@Override
	public void communicate() {
		System.out.println("I mew");
	}
	
	public abstract void eat();
}
