package j09_클래스;

public class Car {
	
	String company;
	String model;
	String color;
	
	public Car() {
		// 기본생성자가 생략되어있었다.
		System.out.println("생성자 호출");
//		생성자는 무조건 주소값을 리턴한다.
//		생성자는 무조건 클래스와 이름이 동일하다.
	}
	
	void showCarInfo()
	{
		System.out.println("회사명: " + company );
		System.out.println("모델명: " + model );
		System.out.println("색상: " + color );
		System.out.println();
	}
}