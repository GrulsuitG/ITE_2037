package exceptionExam;

public class ThrowsExceptionHandling1 {
	public void occurException() throws ArithmeticException {
		// ArithmethicException 발생
		int result = 3/0;
		System.out.println( result);
	}
	
	public static void main(String[] args) {
		ThrowsException te = new ThrowsException();
		//try-catch 블록으로 예외 처리
		try{
			te.occurException();
		} catch( ArithmeticException ae) {
			System.out.println( "Exception이 발생 : "+ ae.toString());
			System.out.println( " 0으로 나눌 수 없습니다.");
		}
	}

}
