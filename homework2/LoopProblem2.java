package homework2;

import java.util.Scanner;

public class LoopProblem2 {

	public static void main(String[] args) {
		int max, min, multi;
		Scanner key = new Scanner(System.in);

		System.out.print("첫번째 수 : ");
		max = key.nextInt();
		System.out.print("두번째 수 : ");
		min = key.nextInt();
		System.out.print("배수 : ");
		multi = key.nextInt();
		
		if(max < min ) {
			int temp = max;
			max = min;
			min = temp;
		}
		int sum = 0;
		for(int i = min; i<=max; i++) {
			if(i%multi==0)
				sum +=i;
		}
		
		System.out.println(min+"에서" +max + "사이의 " 
				+ multi+ "의 배수의 합은" +sum + "입니다.");
	}
}
