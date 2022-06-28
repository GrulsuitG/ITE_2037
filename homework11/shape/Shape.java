package shape;

public abstract class Shape {
	protected int x,y;
	public abstract double area();
	public abstract double circumference();
	public void monve(int x1, int y1) {
		x += x1;
		y += y1;
	}
}
