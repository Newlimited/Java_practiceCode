package j11_상속;

public class Human extends Animal{

//	public void move() {
//		System.out.println("동물이 움직입니다.");
//		
//	}
	
	public Human() {
		System.out.println("Human 객체생성");
		
	}
	@Override 	// 오버라이드 : 재정의 , @-> 어노테이션이라 읽음.
//	super() 가 없으면 부모꺼를 재정의, 있으면 부모꺼도 작동시킨다.
	
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}
