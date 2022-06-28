package exceptionExam;

public class ExceptionTest {
	public void a() throws Exception{
		b();
	}
	
	public void b() throws Exception{
		c();
	}
	
	public void c() throws Exception{
		throw new Exception("여기서 에러발생");
	}
	
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		try {
			et.a();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
