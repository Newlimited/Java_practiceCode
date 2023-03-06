package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * 문제!
		 * names 배열 5개
		 * studentYears 배열 5개
		 * scores 배열 5개
		 * 
		 * 최연호 3 75.9
		 * 강민재 2 80.5
		 * 김지후 4 85.7
		 * 지수연 3 88.3
		 * 최호영 4 78.5
		 * 
		 * 최연호 \t 3학년 75.9점		
		 * 강민재 \t 2학년 80.5점		
		 * 김지후 \t 4학년 85.7점		
		 * 지수연 \t 3학년 88.3점		
		 * 최호영 \t 4학년 78.5점		
		 */
		
		String[] names = {"최연호", "강민재", "김지후", "지수연", "최호영"};
		int[] studentYears = {3, 2, 4, 3, 4};
		double[] Score = {75.9, 80.5, 85.7, 88.3, 78.5};
		
		for(int i = 0; i < names.length; i++) {
			
			System.out.println(names[i] +"\t" + studentYears[i] + "학년\t" + Score[i] + "점" );
			
		}
		
		Student[] students = new Student[5];
		
		students[0] = new Student("홍길동", 3, 15, "부산", "010 -3300 -4698");
		
		for(int i = 0; i < 5; i++) {
			if(students[i] == null) {
				continue;
			}

			System.out.println("이름: " + students[i].getName());
							
		
	}

}
}