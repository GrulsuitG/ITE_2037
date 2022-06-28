package homework13;

public class Circle extends Shape{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(int x, int y,double radius) {
		super(x,y);
		this.radius = radius;
		setName("Circle");
	}
	
	public void draw() {
		System.out.println("Circle draw");
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
}
