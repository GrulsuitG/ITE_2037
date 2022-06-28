package homework13;

public class Triangle extends Shape {
	private double side;

	public Triangle(int x, int y, double side) {
		super(x,y);
		this.side = side;
		setName("Triangle");
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void draw() {
		System.out.println("Triangle draw");
	}
	
	public double area() {
		return Math.sqrt(3)/4*side*side;
	}
}
