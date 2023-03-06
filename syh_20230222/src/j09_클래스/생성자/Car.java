package j09_클래스.생성자;

public class Car {
	/*
	 * 문제!
	 * 밖에서 따로따로 불러오지말고
	 * 생성자를 통해서 값을 주입하는것 만들기
	 * 
	 */
String company ;
String model ;
String color ;

public Car(String company, String model, String color) {
	this.company = company;
	this.model = model;
	this.color = color;
}
void showCarInfo()
{
	System.out.println("회사명: " + company);
	System.out.println("모델명: " + model );
	System.out.println("색상: " + color );
	System.out.println();
	}
}