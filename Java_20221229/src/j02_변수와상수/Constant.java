package j02_변수와상수;

public class Constant {
	public static void main(String[] args) {

		final int MAX_NUMBER = 100 ;
		final int MIN_NUMBER = 0 ;
//		 _로 구분 하는건스네이크 표기법
//		 대문자로 구분하는건 카멜표기법
//		final 쓸때는 대문자로 전부.
		
		final int knum;
		
		int number= 10;
		
		
		
		
		number = 20;
		
		number = 30;
	
		
//maxNumber=  200;	final = 상수 , 고정이됨. 고정값.
		
//		한줄 내려가면 값 초기화댐
		System.out.println("최댓값: " + MAX_NUMBER);
		System.out.println("최솟값: " + MIN_NUMBER);
		System.out.println("현재값: " + number);

	}

}
