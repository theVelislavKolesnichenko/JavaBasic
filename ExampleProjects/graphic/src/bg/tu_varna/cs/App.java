package bg.tu_varna.cs;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.swing.table.TableColumn;

public class App {

	public static void main(String[] args) {
		//rectangleApp();
		shapeApp();
	}

	private static void shapeApp() {
		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle(new Point(5,5), new Point(8,8));
		shapes[1] = new Circle(new Point(10,10), new Point(20,20));
		shapes[2] = new Òriangle(new Point(45,15), new Point(5,5),new Point(90,90));
		shapes[3] = new Rectangle(new Point(15,15), new Point(28,18));
		shapes[4] = new Circle(new Point(100,100), new Point(200,200));
		
		int recB = 0, cirB = 0, triB = 0;
		for(Shape shape : shapes) {
			if(shape instanceof Rectangle)
				recB++;
			if(shape instanceof Circle)
				cirB++;
			if(shape instanceof Òriangle)
				triB++;
		}
		
		System.out.println("Rectangle count: " + recB);
		System.out.println("Circle count: " + cirB);
		System.out.println("Triangle count: " + triB);
		
		
	}
	
	private static void rectangleApp() {

		Rectangle[] rectangles = new Rectangle[5];
		
		Random rand = new Random();
		
		for(int i = 0; i < 5; i++ ) {
			
			Point a = new Point(rand.nextInt(99), rand.nextInt(99));
			Point b = new Point(rand.nextInt(99), rand.nextInt(99));
			
			rectangles[i] = new Rectangle(a, b);
		}
		
		for(Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
		
		Rectangle rec = rectangles[0];
		for(Rectangle rectangle : rectangles) {
			if(rec.compareTo(rectangle) == 1) {
				rec = rectangle;
			}
		}
		
		System.out.println("Max: " + rec);
	}
	
}
