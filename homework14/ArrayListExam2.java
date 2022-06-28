package homework14;

import java.util.ArrayList;
import java.util.List;

class Score{
	private int score;
	
	public Score(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
}

public class ArrayListExam2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(10));
		list.add(20);
		list.add(30);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		List<Score> scores = new ArrayList<Score>();
		scores.add(new Score(100));
		scores.add(new Score(80));
		scores.add(new Score(90));
		
		int sum = 0;
		double avg =0.0;
		
		for(Score s : scores) {
			sum += s.getScore();
		}
		avg = sum/(double)scores.size();
		System.out.printf("총점 : %d, 평균 : %.2f",sum, avg);
	}
}
