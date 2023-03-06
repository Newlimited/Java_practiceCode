package j11_상속.Factory;

public class LGFactory extends Factory{
	
	public LGFactory(int factoryNumber) {
		super(factoryNumber);
	}

@Override
public void start() {
	System.out.print("엘지 ");
	super.start();
}
@Override
public void stop() {
	System.out.print("엘지 ");
	super.stop();
}

public void produceSmartTv() {
	System.out.println("LG 스마트 TV를 생산합니다.");
}

}
