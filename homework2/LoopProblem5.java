package homework2;
import java.util.Scanner;

public class LoopProblem5 {

	public static void main(String[] args) {
		int num ;
		Scanner key = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력하세요 : ");
		num= key.nextInt();
		
		for(int i = 0; i<num; i++){
			for(int j = num-i; j>0; j--) {
				System.out.print("*");
			
			}
			System.out.println();
				
			
		}
	}

}
