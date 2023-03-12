package j15_스태틱.싱글톤;
/*
 * 싱글톤(Singleton)
 * 유일한 객채를 만들어서 공유하는 생성패턴
 * 1. 생성자는 접근지정자가 private이다.
 * 2. 자기 자신의 유일한 객체를 담을 수 있는 instance라는 변수명을 
 * 		가진 스태틱 변수가 필요하다.
 * 3. instance 변수를 리턴(공유) 해줄 getInstance 스태틱 메서드가 필요하다.
 * 
 */
public class KIA {

//	private KIA() {};
	
	private static KIA instance;
	// 주차장처럼 한다 ... -> 하나의 틀에 10개의 방을 만든다. 계속 틀을 만드는것이아니라서
	// 틀 한개로 고정을 시킨다.
	private Car[] carArray;
	private int autoCode;
	private KIA() {
		carArray = new Car[10];
		autoCode = 2023000;

	}

	public static KIA getInstance() {
		if (instance == null) {
			instance = new KIA();
		}
		return instance;
	}

	public Car produceCar(String model) {
		int carNumber = ++autoCode;
		String company = getClass().getSimpleName();
//		Car car = new Car(carNumber, company, model); 
//		@builder 로 아래와 같이 한번에 만든다.
		Car car = Car.builder()
					.carNumber(carNumber)
					.company(company)
					.model(model).build();
		
		if (addCar(car)) {
			return car;
		}
		return null;
	}

	private boolean addCar(Car car) {
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = car;
				System.out.println("배열에 차량 추가 완료");
				return true;

			}
		}
		System.out.println("배열에 공간이 없습니다.");
		return false;
	}
}
