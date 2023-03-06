package j17_컬렉션.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		// j15, 스태틱에 있는 Student
		Student student1 = new Student("김철수");
		Student student2 = new Student("박길동");
		Student student3 = new Student("최수연");
		Student student4 = new Student("우영우");
		Student student5 = new Student("이수지");
		/*
		 * studentList
		 * Student 배열을 생성하고 그 배열을 리스트로 변환 후에
		 * 새로운 ArrayList를 생성하여 전체를 추가
		 */
	
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Student[] students = {student1, student2, student3, student4, student5};
		//배열만들어주기 asList 그리고 addAll로 studentList에 넣기.
		studentList.addAll(Arrays.asList(students));	
		System.out.println(studentList);
			
		
		for(Student student : studentList) {
			System.out.println(student);
			
		}

		/*
		 * 학생이름 최수연인 객체를 찾아서
		 * 출력하고 삭제하기
		 * for 반복문 사용
		 */
	
		//contains 사용해서 해보기. - > 자습. 아래에는 getNmae을 써서 해결.
		for(int i = 0 ; i < studentList.size(); i++) {
			if(studentList.get(i).getName().equals("최수연")) {
				System.out.println(studentList.get(i));
				studentList.remove(i);
			}			
		}
		System.out.println();
		System.out.println(studentList);
		
	}
}