package j13_최상위클래스;

public class ObjectMain {

	public static void main(String[] args) {

		Object object = new Object();
		Test test = new Test();
		
		Object test2 = new Test(); // 빨간줄이안떳음 , 상속 or 구현이 이미 되어있다라는 것
		/*
		 * 오브젝트는 전부 상속이 이미 되어있다.
		 * 모든 클래스들은 Object 객체를 상속으로 가지고 있다.
		 */
		
		
	}

}
