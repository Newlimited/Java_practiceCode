package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		char a = '가';
		int b = a;
	
//		형변환, int 는 정수 , char 는 문자인데 나오는건 65?
		
		double c = b;
		
		System.out.println(b);
		System.out.println(c);
		
		int d = (int)c;
		char e = (char)d;
		
		System.out.println(d);
		System.out.println(e);
//		업캐스팅 다운캐스팅 . char 문자-> int 정수-> double 실수 (업캐스팅)
//		업캐스팅시 괄호 안적어도됨, 묵시적 형 변환. 다운캐스팅은 형변환 타입 생략 불가능
	}
	
}