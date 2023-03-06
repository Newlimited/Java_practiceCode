package j09_클래스.생성자;

public class CarMain {

	public static void main(String[] args) {

		
		Car car1 = new Car("현대자동차", "SONATA","White");
		Car car2 = new Car("KIA" , "K5", "Black");
		Car car3 = new Car("현대자동차", "아반떼","GRay");
		
		car1.showCarInfo();
		car2.showCarInfo();
		car3.showCarInfo();
	}

}
