package j15_스태틱;

public class StaticMain {

	public static void main(String[] args) {
//		StaticTest staticTest = new StaticTest();
//		staticTest.name = "김철수";
//		
//		System.out.println(staticTest.name);
//		
//		StaticTest staticTest2 = new StaticTest();
//		System.out.println(staticTest2.name);
//		
//		staticTest2.name = "김똥깨";
//		System.out.println(staticTest2.name); //메모리에 바로 할당되서... static 은 메모리할당
//		System.out.println(staticTest.name);
//		
//		StaticTest.name = "김철수";
//		System.out.println(staticTest.name);
		
		
		// 클래스는 집 틀을 만든다 , 근데 static 을 붙이면 틀을 만들때 같이 메모리 할당을 시킨다.
		// 따라서 new 로 생성을 하더라도 해당 틀을 그대로 들고오기때문에 이미 할당된것은 모든 new에 적용된다.
		// 두번째 김똥깨로 지정을 하게 되면 모든 틀에 있는 name 메모리가 김똥깨로 지정된다.
		StaticTest.printTest();
		// 생성을 하지 않았는데도 실행이 된다. 
		// 메서드에 static을 붙여서 생성을 하지 않아도 된다.
		
	}  
}