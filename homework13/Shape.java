package homework13;

public abstract class Shape {
	private int x,y;
	private String name;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void draw();
	
	public abstract double area();
	
}
