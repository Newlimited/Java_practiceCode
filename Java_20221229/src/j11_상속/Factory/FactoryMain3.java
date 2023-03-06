package j11_상속.Factory;

public class FactoryMain3 {

	public static void main(String[] args) {

		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);

		SamsungFactory sFactory = new SamsungFactory(1);
		System.out.println(sFactory);
		

		System.out.println((Factory) sFactory);
//		명시적을 해주면 업캐스팅이된다. 
		
		Factory f = sFactory;
		
		SamsungFactory sf = (SamsungFactory) f;

		// 클래스 자료형은 바로 다운캐스팅이 될 수 없다. 
		// 팩토리가 더 큰 객체. 작은객체에서 올라갔다 내려올순잇지만.
		// 큰객체에서 바로 아래로 내려갈 수 없다.
//		Factory f2 = new Factory(1);
//		SamsungFactory sf2 = (SamsungFactory) f2;
//		System.out.println(sf2);

		/*
		 * 기본자료형과 클래스 자료형의 형변환 차이
		 * 기본 자료형은 업, 다운 다됨.
		 * 클래스 자료형 팩토리에서 삼성팩토리 안됨.
		 * 삼성 - 팩토리 - 삼성은 가능
		 */
		
		// 업, 다운
//		int num = 10;
//		double dNum = (double)num;
//		System.out.println(dNum);
//		
//		System.out.println((int)dNum);
		
	}

}
