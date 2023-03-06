package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
	
		s1.setName("김철수");
		
		System.out.println(s1.getName());
	}
/*
 * 접근지정자 - 은행!
 * 클래스 변수는 private 로 보호
 * 문제발생! 클래스.변수명 으로 값주입 안됨.
 * 생성자 를 통해 값 주입
 * 1개 값을 넣고 싶다면 귀찮게 모든생성자 다 생성 ??? - >오버로딩
 * set, get 으로 값주입 ==> private로 걸려있어서....
 */
	
	
	
}
