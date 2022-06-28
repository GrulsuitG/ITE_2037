package homework14;

class OuterClass{
	private int a;
	private int b;
	
	public OuterClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public InnerClass getInner() {
		return new InnerClass();
	}
	
	class InnerClass{
		public double getMul() {
			return a*b;
		}
	}
}

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass(100,200);
		OuterClass.InnerClass inner = outer.getInner();
		System.out.println("inner값: "+ inner.getMul());
		
		OuterClass.InnerClass in =outer.new InnerClass();
	}
}
