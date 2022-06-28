package Homework1;

public class FirstProblem {

	public static final int INT_RATE = 5;
	
	public static void main(String[] args) {
		
		double princi_amnt = 1000;
		int no_of_yrs = 5;
		
		
		System.out.println("Principal Amounnt : " +princi_amnt);
		System.out.println("Interest Rate : " +INT_RATE);
		System.out.println("Number of yeras : " +no_of_yrs);
		System.out.println("Simple Interest : " +princi_amnt*INT_RATE*no_of_yrs/100);
	
		
	}

}
