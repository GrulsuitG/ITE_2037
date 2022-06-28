package exceptionExam;

import java.io.*;

public class IOExceptionError {
	public static void main(String[] args) {
		FileReader file = new FileReader("a.txt");
		//만일 a.txt 파일이 없다면??
		int i;
		while((i = file.read()) != -1) {
			System.out.println((char) i);
		}
		file.close();
		
	}
}
/*
public class IOExceptionError {
	public static void main(String[] args) {
		try {// 예외가 발생할 가능성이 있는 문장을 try 블록으로 지
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.println((char) i);
			}
			file.close();
		} catch (Exception e) { //발생된 예외를 처리하는 부분
			System.out.println("예외 처리 루틴 : " +e+ " 예외 발생");
		}
		
	}
}
*/