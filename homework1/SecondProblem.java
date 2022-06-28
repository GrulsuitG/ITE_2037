package Homework1;

public class SecondProblem {

	public static void main(String[] args) {
		int time = 62942;
		int hour = time/3600;
		int min = time%3600/60;
		int sec = time%3600%60;
		
		System.out.println(time +" second is " + hour + ": " +min +": " + sec);

	}

}