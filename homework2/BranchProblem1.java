package homework2;
import java.util.Scanner;

public class BranchProblem1 {
	public static void main(String[] args) {
		int n1, n2;
		String op;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("첫번째 수 =  ");
		n1 = keyboard.nextInt();
		System.out.print("연산자(+,-,*,/,%) =");
		op = keyboard.next();
		System.out.print("두번째 수 = ");
		n2 = keyboard.nextInt();
		
		int result = 0;
				
		switch(op) {
			case "+": 
				result = n1+n2; break;
			case "-": 
				result = n1-n2; break;
			case "*": 
				result = n1*n2; break;
			case "/": 
				result = n1/n2; break;
			case "%": 
				result = n1%n2; break;	
		}
		System.out.println(n1 + op + n2 +" = "+ result);

	}

}
