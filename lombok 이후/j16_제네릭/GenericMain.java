package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {

		GenericTest genericTest = new GenericTest();
		
		genericTest.setNumber(100);
		genericTest.setData("200");
		
//		System.out.println(genericTest.getNumber() + genericTest.getData());

		GenericTest<String, Integer> genericTest2 = new GenericTest<>();
		genericTest2.setNumber(100);
		genericTest2.setData("200");
//		Data에 정수를 넣었다.(Integer = 정수형)
//		Int라 적은게아니라 Integer라 적은이유는 클래스자료형으로 적어주어야하기떄문
//		Int 는 기본자료형이고 Integer = 클래스자료형
		
		System.out.println(genericTest2.getNumber() + genericTest2.getData());
	}

}