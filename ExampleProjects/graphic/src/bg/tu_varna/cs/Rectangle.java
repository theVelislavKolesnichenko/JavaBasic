package bg.tu_varna.cs;

public class Rectangle implements Comparable, Shape {
	private Point a, b;
	
	public Rectangle(Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	
	public Rectangle() {
		this(new Point(), new Point());
	}

	private double lineA() {
		return b.getX() - a.getX();
	}
	
	private double lineB() {
		return b.getY() - a.getY();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Rectangle rec = (Rectangle) obj;
		
		return lineA() == rec.lineA() && lineB() == rec.lineB();
	}

	@Override
	public String toString() {
		return String.format(
					"Rectangle [ Point A (%d, %d), Point B (%d, %d) ]", 
					this.a.getX(), 
					this.a.getY(),
					this.b.getX(),
					this.b.getY()
				);
	}

	@Override
	public int compareTo(Object o) {
		Rectangle rec = (Rectangle) o;
		
		if(this.area() == rec.area())
			return 0;
		else if(this.area() < rec.area())
			return -1;
		else return 1;
	}

	@Override
	public double area() {	
		return lineA()*lineB();
	}
	
	@Override
	public double perimeter() {
		return 2*lineA() + 2*lineB();
	}
}
