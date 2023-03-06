package j12_다형성.인터페이스;

/*
 * 인터페이스 특징 (상속이라 하지않고 구현이라고 한다.)
 * 1. 모든 Method는 기본적으로 abstract Method로 정의한다.
 * 2. 생성을 할 수 없다.
 * 3. 일반 변수는 선언할 수 없다.
 * 4. 무조건 static(<-아직안배움 보류) 상수를 사용한다.
 * 5. 일반 Method를 정의하기 위해서는 반환 자료형 앞에 default를 입력해야한다.
 * ex) public default void disConnect();
 * 6. 인터페이스는 다중구현이 가능하다.
 *  
 */
public  interface HDMI {
	public void connect();
	public void disConnect();
	
	public double VERSION = 2.0;


	
}
