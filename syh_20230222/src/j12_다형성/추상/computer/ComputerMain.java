package j12_다형성.추상.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c1 = new Laptop();
		Computer c2 = new DesktopImpl();
//		추상클래스라서 computer로 생성할수 없다. - > 추상 클래스는 생성자를 만들수없기떄문에 
		c1.onKeyPress();
		c1.onDisplay();
		
		c2.onDisplay();
		c2.onKeyPress();
		
		((Desktop) c2).onMouseClick(); // 다운캐스팅을 해줘야 한다.
		c1.onSound();
		c2.onSound();
	}

}