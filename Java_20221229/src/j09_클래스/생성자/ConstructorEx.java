package j09_클래스.생성자;

public class ConstructorEx {
	
	
	String name;
	int birth;
	
//	NoArgsConstructor 아무것도 안받는 생성자 <기본생성자>
	public ConstructorEx() {
		System.out.println("기본생성자");
		
	}
//	RequiredArgsConstructor 일부만받는 생성자
	public ConstructorEx(String name) {
		System.out.println("매개변수: "+ name);
		System.out.println("name을 매개변수로 받는 생성자");
		this.name = name;
//		위에 선언된 것과 메소드 매개변수의 name 과 같게만듬. -> 메인에서 constrcutorEx2.name 에서 이름이 나옴
	
	}

//	RequiredArgsConstructor 일부만받는 생성자
	public ConstructorEx(int birth) {
		System.out.println("매개변수: " + birth);
		System.out.println("birth를 매개변수로 받는 생성자");
		this.birth = birth;
	}

//	AllArgsConstructor 모두 다 받는 생성자

	public ConstructorEx(String name, int birth) {
		System.out.println("매개변수: "  + name);
		System.out.println("매개변수: "  + birth);
		System.out.println("전체 생성자");
		this.name = name;
		this.birth = birth;
	}
	
//	Args -> Arguments(인수 , 매개변수)
// 		매개변수를 받는데 각자 달라서 오버로딩을 한다.
}
