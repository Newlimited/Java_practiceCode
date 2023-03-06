package j14_lombok;

public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		
		Car car = builder.builder()
				.company("현대")
				.color("White")
				.modle("쏘나타")
				.build();
		// builder = CarBuilder 에 있는 메서드 . 주소 생성 , 값 주고 , 마지막 build 로 닫는다.
		
		System.out.println(car);
				
	}

}
