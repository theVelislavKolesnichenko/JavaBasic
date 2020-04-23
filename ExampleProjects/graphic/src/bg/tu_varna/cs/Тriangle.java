package bg.tu_varna.cs;

public class Òriangle implements Shape {

	private Point a, b, c;
	
	public Òriangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Òriangle() {
		this(new Point(), new Point(), new Point());
	}

	private double lineA() {
		return Math.sqrt(
				Math.abs(b.getX() - a.getX()) + 
				Math.abs(b.getY() - a.getY())
				);
	}
	
	private double lineB() {
		return Math.sqrt(
				Math.abs(b.getX() - c.getX()) + 
				Math.abs(b.getY() - c.getY())
				);
	}
	
	private double lineC() {
		return Math.sqrt(
				Math.abs(a.getX() - c.getX()) + 
				Math.abs(a.getY() - c.getY())
				);
	}
	@Override
	public double perimeter() {
		return lineA() + lineB() + lineC();
	}

	@Override
	public double area() {
		double p = perimeter() / 2;
		return Math.sqrt(
					p*
					(p - lineA())*
					(p - lineB())*
					(p - lineC())
				);
	}
}
