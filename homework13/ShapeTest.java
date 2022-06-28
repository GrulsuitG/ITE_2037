package homework13;

public class ShapeTest {
	private static Shape[] arrayOfShapes;
	public static void main(String[] args) {
		init();
		draw();
	}
	
	public static void init() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle(5,5,10,10);
		arrayOfShapes[1] = new Triangle(5,5,5);
		arrayOfShapes[2] = new Circle(5,5, 10);
	}
	
	public static void draw() {
		for(Shape s : arrayOfShapes) {
			s.draw();
			System.out.println(s.getName() +" area : " + s.area());
		}
	}
}
