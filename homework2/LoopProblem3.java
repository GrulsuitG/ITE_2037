package homework2;
import java.util.Scanner;

public class LoopProblem3 {

	public static void main(String[] args) {
		int std,cnt;
		Scanner key = new Scanner(System.in);
		
		for(;true;) {
			cnt =0;
			System.out.println("=== 1부터 입력하신 숫자사이의 홀수의 개수를 알려드립니다.===");
			System.out.print("숫자를 입력하세요.(종료시 0을 입력하세요.) =>");
			std = key.nextInt();
			if(std ==0)
				break;
			for(int i= 1; i<=std; i++) {
				if(i%2 ==1)
					cnt++;
			}
			
			System.out.println("1에서 " + std +"사이의 홀수의 개수는 "
					+cnt+"개 입니다.");
		}

	}

}
