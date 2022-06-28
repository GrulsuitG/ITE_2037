package homework6;

class Point{
	private int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Rect {
	private Point start;
	private Point end;
	private int area;
	private int circum;
	
	public Rect(Point p1, Point p2){
		start = p1;
		end = p2;
		area = (p2.getX()-p1.getX())*(p2.getY()-p1.getY());
		circum = ((p2.getX()-p1.getX())+(p2.getY()-p1.getY()))*2;
	}
	public Rect(int x1, int y1, int x2, int y2){
		start = new Point(x1, y1);
		end = new Point(x2, y2);
		area =((x2-x1)*(y2-y1));
		circum =((x2-x1)+(y2-y1))*2;
	}
	
	public Point getStart() {
		return start;
	}
	public Point getEnd() {
		return end;
	}
	public int getArea() {
		return area;
	}
	public int getCircum() {
		return circum;
	}
}

class RectTest{
	public static void main(String[] args) {
		Point p1 = new Point(10, 10);
		Point p2 = new Point(20, 20);
		Rect a = new Rect(p1, p2);
		System.out.print("시작점("+a.getStart().getX() + "," + a.getStart().getY() +")");
		System.out.println("끝점("+a.getEnd().getX() + "," + a.getEnd().getY() +")");
		System.out.println("넓이="+a.getArea());
		System.out.println("둘레="+a.getCircum());
		Rect b = new Rect(10, 10, 20, 20);
		System.out.print("시작점("+b.getStart().getX() + "," + b.getStart().getY() +")");
		System.out.println("끝점("+b.getEnd().getX() + "," + b.getEnd().getY() +")");
		System.out.println("넓이="+b.getArea());
		System.out.println("둘레="+b.getCircum());
	}
}