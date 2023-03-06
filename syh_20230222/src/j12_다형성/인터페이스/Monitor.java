package j12_다형성.인터페이스;

public class Monitor implements HDMI,VGA{

	
	@Override
	public void connect() {
		System.out.println("HDMI를 통해 모니터를 연결합니다.");
	
	}
	

	@Override
	public void disConnect() {
		System.out.println("HDMI에 연결된 모니터 연결을 해제합니다.");
		
	}


	@Override
	public void VgaConnect() {
		System.out.println("VGA를 통해 모니터를 연결합니다.");
	}


	@Override
	public void VgaDisConnect() {
		System.out.println("VGA에 연결된 모니터 연결을 해제합니다.");
	}
			
//	implements - > 구현

//	,VGA 로 해서 다중 구현 시도해보기... VGA 만들어서
}
