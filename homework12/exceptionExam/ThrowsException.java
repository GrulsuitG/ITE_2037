package exceptionExam;

public class ThrowsException {
	public void occurException() {
		int result = 3/0;
		System.out.println( result);
	}
	
	public static void main(String[] args) {
		ThrowsException te = new ThrowsException();
		te.occurException();
	}
}
