package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 문제!
		 * 변수
		 * 		company
		 * 		model
		 * 		color
		 * 
		 * 메소드
		 * 	showCarInfo()
		 * 		회사명 : 000
		 * 		모델명 : 000
		 * 		색상 :	000
		 * 
		 * 3대 제작
		 * 현대자동차
		 * 쏘나타
		 * 화이트
		 * 
		 * 기아
		 * k5
		 * 블랙
		 * 
		 * 현대자동차
		 * 아반떼
		 * 그레이
		 */
	Car car1 = new Car();
	Car car2 = new Car();
	Car car3 = new Car();
	
	car1.company = "현대자동차";
	car1.model = "SONATA";
	car1.color = "White";
	
	car2.company = "KIA";
	car2.model = "K5";
	car2.color = "Black";
	
	car3.company = "현대자동차";
	car3.model = "AVANTE";
	car3.color = "Gray";
	
	car1.showCarInfo();
	System.out.println();
	car2.showCarInfo();
	System.out.println();
	car3.showCarInfo();
	
	new Car();
	
	
	}

}
