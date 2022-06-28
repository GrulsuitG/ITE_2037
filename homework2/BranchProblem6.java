package homework2;

import java.util.Scanner;

public class BranchProblem6 {

	public static void main(String[] args) {
		int num, tenDigit, oneDigit, count=0;
		Scanner key = new Scanner(System.in);
		
		System.out.print("1~99사이의 정수를 입력하세요 : ");
		num = key.nextInt();
		
		tenDigit = num/10;
		oneDigit = num%10;

		
		if(tenDigit%3 == 0)
			count++;
		if(oneDigit%3 ==0)
			count++;
	
		if(count ==2)
			System.out.println("박수짝짝");
		else if (count ==1)
			System.out.println("박수짝");
	}

}
