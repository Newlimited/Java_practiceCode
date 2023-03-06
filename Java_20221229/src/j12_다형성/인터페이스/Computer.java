package j12_다형성.인터페이스;

public class Computer {
	
	private HDMI hdmi;
	private VGA vga;
	
	public Computer(HDMI hdmi, VGA vga) {
		super();
		this.hdmi = hdmi;
		this.vga = vga;
	}

	
	public void powerOn() {
		System.out.println("컴퓨터의 전원을 켭니다");
		connectedDisplay();
		
	}
	
	public void powerOff() {
		disConnectedDisplay();
		System.out.println("컴퓨터의 전원을 끕니다.");
	}
	
	private void connectedDisplay() {
		System.out.println("출력 장치를 연결합니다.");
		hdmi.connect();
		vga.VgaConnect();
	}
	
	private void disConnectedDisplay() {
		System.out.println("출력 장치 연결을 해제합니다.");
		hdmi.disConnect();
		vga.VgaDisConnect();
	}
	
}
