package bg.tu_varna.cs;

public class Circle implements Shape {
	private Point a, b;
	
	public Circle(Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	
	public Circle() {
		this(new Point(), new Point());
	}

	private double radius() {
		return Math.sqrt((b.getX() - a.getX()) + (b.getY() - a.getY()));
	}
	
	@Override
	public double perimeter() {
		return 2*Math.PI*radius();
	}

	@Override
	public double area() {
		return Math.PI*radius()*radius();
	}
	
	
}
