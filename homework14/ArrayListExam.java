package homework14;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExam {
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(100);
		Integer i2 = 200;
		
		int total = i1.intValue() + i2;
		System.out.println(total);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		
		System.out.println("=== 데이터 삽입후 검색 ===");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		al.remove(Integer.valueOf(20));
		System.out.println("=== 데이터 삭제후 검색 ===");
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		al.add(0,100);
		System.out.println("=== 데이터 삽입후 검색 ===");
		for(Iterator<Integer> itr = al.iterator(); itr.hasNext();) {
			int i = itr.next();
			System.out.println(i);
		}
		
	}
}
