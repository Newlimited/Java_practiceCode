package j11_상속.Factory;

public class SamsungFactory extends Factory{
// 부모에 맞게 생성자를 만들어야 한다. 안그럼 빨간줄뜬다.
	// Factory 에 int가 있으므로 아래와 같은 생성자를 만들어준다.
	public SamsungFactory(int factoryNumber) {
		super(factoryNumber);
	
		
	}
@Override
	public void start() {
	System.out.print("삼성 ");
	super.start();
	}

@Override
	public void stop() {
	System.out.print("삼성 ");
	super.stop();
	}
 public void produceSmartPhone()
 {
	 System.out.println("삼성 스마트폰을 만듭니다.");
	 
 }


}