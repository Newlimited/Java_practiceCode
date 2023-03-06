package j09_클래스.생성자;

public class ConstructorEx2 {
	String name;
	int birth;
	
//		Alt + shift + s -> Generate Constructor UsingFields ~ 
//		생성자 만드는 단축키
	
	
	public ConstructorEx2() {
	}
	
	public ConstructorEx2(String name) {
		this.name = name;
	}


	public ConstructorEx2(int birth) {
	this.birth = birth;
}

	public ConstructorEx2(String name, int birth) {
	this.name = name;
	this.birth = birth;
}
	
//	오버로딩하면 기본생성자는 비활성화 된다.
}