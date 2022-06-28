package homework13;

public class Rectangle extends Shape {
	private double width, height;
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
		setName("Rectangle");
	}
	
	public void draw() {
		System.out.println("Rectangle draw");
	}
	
	public double area() {
		return height*width;
	}
}
