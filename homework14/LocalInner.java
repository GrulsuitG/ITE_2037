package homework14;

public class LocalInner {
	private String name = "LocalInner";
	public void print(final String msg) {
		class Inner{
			public void print() {
				System.out.println(name);
				System.out.println(msg);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
	
	public static void main(String[] args) {
		LocalInner test = new LocalInner();
		test.print("Hello");
	}
}
