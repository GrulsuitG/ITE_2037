package homework2;
import java.util.Scanner;

public class LoopProblem4 {

	public static void main(String[] args) {
		double koreanScore, mathScore, englishScore;
		double average, sum;
		Scanner key = new Scanner(System.in);
		
		sum =0;
		do {
		System.out.print("국어 = ");
		koreanScore = key.nextInt();
		}while(koreanScore < 0 || koreanScore > 100);
		sum+= koreanScore;
		do {
			System.out.print("영어 = ");
			englishScore = key.nextInt();
		}while(englishScore < 0 || englishScore > 100);
		sum += englishScore;
		do {
			System.out.print("수학 = ");
			mathScore = key.nextInt();
		}while(mathScore < 0 || mathScore > 100);
		sum += mathScore;
		average = sum/3;
		
		System.out.println("총점 : " +sum);
		System.out.printf("평균 : %.2f \n" ,average);
		if(average >=90)
			System.out.println("학점 : A학점");
		else if (average >= 80)
			System.out.println("학점 : B학점");
		else if (average >= 70)
			System.out.println("학점 : C학점");
		else if (average >= 60)
			System.out.println("학점 : D학점");
		else
			System.out.println("학점 : F학점");
		
	}

}
