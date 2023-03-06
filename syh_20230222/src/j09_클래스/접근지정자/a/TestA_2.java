package j09_클래스.접근지정자.a;

public class TestA_2 {

	int ta2;
	
	public void testA2() {
		System.out.println("TestA-2 메소드 호출");
		TestA testA = new TestA();
		testA.ta1 = "테스트 A-2에서 값 주입";
		testA.testA1();
		System.out.println(testA.ta1);
		
	}
		//	public 이 없으면 default 로 자동 설정 default 는 동일패키지까지만가능
}
