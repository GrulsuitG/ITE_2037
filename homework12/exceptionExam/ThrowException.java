package exceptionExam;

public class ThrowException {
	public void exceptionMethod() throws ArrayIndexOutOfBoundsException{
		int[] intA = {1,2,3,4};
		for(int i=0; i <10; i++) {
			//예외를 던짐
			if (i ==4) throw new ArrayIndexOutOfBoundsException();
			System.out.println(intA[i]);
		}
	}
	
	public static void main(String[] args) {
		ThrowException te = new ThrowException();
		try {
			te.exceptionMethod();
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("배열의 index를 초과했습니다.");
			ab.printStackTrace();
		}
	}
}
