package homework2;
import java.util.Scanner;

public class BranchProblem3 {
	public static void main(String[] args) {
		int max, min, med, temp;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("첫번째 수 = ");
		max = keyboard.nextInt();
		
		System.out.print("두번째 수 = ");
		med = keyboard.nextInt();
		if(med>max) {
			temp = med;
			med = max;
			max = temp;
		}	
		System.out.print("세번째 수 = ");
		min = keyboard.nextInt();
	
		if(min>=max)
		{
			int temp2;
			temp = max;
			temp2 = med;
			max = min;
			med = temp;
			min = temp2;
		}
		else if(min >=med) {
			temp = min;
			min = med;
			med = temp;
		}		
		System.out.println(max + " >= " + med + " >= "+ min);	
	}

}
