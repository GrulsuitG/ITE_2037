package homework2;

import java.util.Scanner;

public class BranchProblem4 {

	public static void main(String[] args) {
		char ch;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("영문자 1자를 입력하세요 : ");
		ch = keyboard.next().charAt(0);
		
		if('a'<= ch && ch <= 'z')
		{
			System.out.printf(ch +" => %c \n", ch-32);
		}
		else if ('A'<= ch && ch <='Z') {
			System.out.printf(ch + " => %c \n", ch+32);
		}
		else {
			System.out.println("영문자가 아닙니다.");
			
		}
			
		
	}

}
