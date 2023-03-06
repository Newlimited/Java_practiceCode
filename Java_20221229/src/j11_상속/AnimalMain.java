package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		

			Human human = new Human();
			
//			휴먼에서 기본생성자 호출 -> 기본생성자가 부모클래스 호출 
			Tiger tiger = new Tiger();
			
			
			human.move();
	}

	}
