package j09_클래스.생성자;

public class ConstructorMain2 {

	public static void main(String[] args) {
	
		ConstructorEx2 constructorEx2 = new ConstructorEx2();
				
//		생성자는 기본 생성자외 다른 생성자를 오버로딩하면 기본 생성자는 비활성화 된다.
//		기본 생상저가 꼭 필요할 시 무조건 명시를 해줘야 한다.
	
		ConstructorEx2 ex1 = new ConstructorEx2(722);
		System.out.println(ex1.birth);
		
	}

}
