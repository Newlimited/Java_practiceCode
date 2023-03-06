package j13_최상위클래스;

public class Student {

	private int studentCode;
	private String name;
	public Student(int studentCode, String name) {
		super();
		this.studentCode = studentCode;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = studentCode == ((Student) obj).studentCode 
//				&& name.equals(((Student) obj).name);
//		//						다운캐스팅
//		return result;
//	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
}
