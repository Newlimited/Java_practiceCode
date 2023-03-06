package j13_최상위클래스;

public class EqualsMain {

	public static void main(String[] args) {
		Student s1 = new Student(20220001, "김철수");
		Student s2 = new Student(20220001, "김철수");
		Student s3 = new Student(20220002, "김영희");
		Student s4 = new Student(20220002, "김철수");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
	
		System.out.println(s1);
		System.out.println(s2);
	}

}
