package 연습완료;

public class 접근지정자메인 {

	public static void main(String[] args) {
		접근지정자1 cal = new 접근지정자1();
		접근지정자1 ca2 = new 접근지정자1();
		
		cal.a = 3;
		ca2.b = 5;
		cal.b = 5;
		ca2.a = 6;
		
		cal.show();
		ca2.show();
		
		cal.show2(10, 20);
		ca2.show2(20, 30);
		
	}

}
