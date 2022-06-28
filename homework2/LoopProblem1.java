package homework2;

import java.util.Scanner;

public class LoopProblem1 {

	public static void main(String[] args) {
		int max, min, temp;
		Scanner key = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		max = key.nextInt();
		System.out.print("두번째 수 : ");
		min = key.nextInt();
		
		if(max < min ) {
			temp = max;
			max = min;
			min = temp;
		}
		int sum = 0;
		for (int i = min; i<=max; i++) {
			sum +=i;
		}
		
		System.out.println(min+"에서" +max +
				"사이의 합은 " +sum + "입니다.");
	}

}
