package j12_다형성.인터페이스;

public class ComputerMain {

	public static void main(String[] args) {

		Monitor monitor = new Monitor();
		Computer computer = new Computer(monitor, monitor);
		
		
		computer.powerOn();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10); // 500이 5초. 5초뒤에 powerOff 실행 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		computer.powerOff();
		
		
	}

}
