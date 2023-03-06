package j09_클래스.생성자;

public class ConstructorMain {

	public static void main(String[] args) {
		
		ConstructorEx constructorEx1 = new ConstructorEx();
		ConstructorEx constructorEx2 = new ConstructorEx("김철수");
		ConstructorEx constructorEx3 = new ConstructorEx(722);
		ConstructorEx constructorEx4 = new ConstructorEx("김철수", 722);
		
		System.out.println(constructorEx4.birth);
		System.out.println(constructorEx3.birth);
		
	}

}
