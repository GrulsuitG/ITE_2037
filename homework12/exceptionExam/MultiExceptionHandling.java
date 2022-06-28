package exceptionExam;

public class MultiExceptionHandling {
	public static void main(String[] args) {
		int value = 20;
		int div = 10;
		int[] intArray = {1, 2, 3};
		
		try {
			int result = value /div;
			System.out.println( result);
			int arrayValue = intArray[0];
			System.out.println(arrayValue);
		} catch( ArithmeticException ae) {
			System.out.println(ae.toString());
		} catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
	}
}
