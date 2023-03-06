package j17_컬렉션.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		/*
		 * 문제
		 * StudentArrayList 에서 했던것 처럼
		 * 배열 만들어서 학생객체 만들고
		 * 학생객체를 Set에다가 추가하고 그중에서 
		 * 최수연 학생을 찾아서 remove 하는것까지.
		 * (remove 는 찾은 객체 그 자체를 넣어주면됨.)
		 */
	
		Student student1 = new Student("김철수");
		Student student2 = new Student("박길동");
		Student student3 = new Student("최수연");
		Student student4 = new Student("우영우");
		Student student5 = new Student("이수지");
	
		HashSet<Student> studentList1 = new HashSet<Student>();
		Student[] students = {student1, student2, student3, student4, student5};
		studentList1.addAll(Arrays.asList(students));
		
		Iterator<Student> ir = studentList1.iterator();
		while(ir.hasNext()) {
			Student student = ir.next();
		if(student.getName().equals("최수연")) {
			studentList1.remove(student);
			break; //break 써야됨 안그러면 찾고나서 지우고 그다음값을 실행시킬수없다.
		}
		}
//		while(ir.hasNext()) {
//			System.out.println(ir.next());
//		}
	System.out.println(studentList1);
	
	}

}
