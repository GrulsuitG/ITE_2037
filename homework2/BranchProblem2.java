package homework2;
import java.util.Scanner;

public class BranchProblem2 {

	public static void main(String[] args) {
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("주민등록번호 7번째 자리를 입력하세요.");
		num = keyboard.nextInt();
		switch(num) {
			case 1:	
				System.out.println("1900년대생 남성입니다.");
				break;
			case 2:
				System.out.println("1900년대생 여성입니다.");
				break;
			case 3:
				System.out.println("2000년대생 남성입니다.");
				break;
			case 4:
				System.out.println("2000년대생 여성입니다.");
				break;
			case 9:
				System.out.println("1800년대생 남성입니다.");
				break;
			case 0:
				System.out.println("1800년대생 여성입니다.");
				break;
		}
		
	}

}
