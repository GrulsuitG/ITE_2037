package homework2;

import java.util.Scanner;
public class BranchProblem5 {

	public static void main(String[] args) {
		int num;
		Scanner key = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		num = key.nextInt();
		
		if(num%4== 0) {
			if(num%100 == 0)
			{
				if(num%400==0) 
					System.out.println("윤년입니다.");
				else	
					System.out.println("평년입니다.");
			}
			else
				System.out.println("윤년입니다.");
		}
		else
			System.out.println("평년입니다.");
		
	}

}
