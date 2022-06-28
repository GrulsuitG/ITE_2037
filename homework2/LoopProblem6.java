package homework2;
import java.util.Scanner;

public class LoopProblem6 {

	public static void main(String[] args) {
		char ch;
		Scanner key = new Scanner(System.in);
		
		System.out.print("알파벳 한 문자를 입력하십시오 >> ");
		ch = key.next().charAt(0);
		
		for(int i ='a'; i<=ch; i++ ) {
			
			for(char j = 'a'; j-'a'<=ch-i; j++) {
				System.out.print(j);
			}
			
		}
	}
}
  



