package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		char name1 = '신';
		char name2 = '비';
		char name3 = '환';
		
//		char name4 = '신비환'; //문자형은 한글자씩, << 문자열임
		
		
		int birth = 722;
		
		System.out.print("이름: ");
		System.out.println(""+name1 + name2 + name3);
//		문자열+문자 = 문자열 ,, 문자열을 써주면된다.즉 "" + 문자
//	System.out.println(name1 + name2 + name3);	
//		아스키 코드 (문자를 숫자로 표현됨)
				System.out.print("생일: ");
		System.out.println(birth);
		System.out.print("주소: ");
		System.out.println("부산 사상구 주례동");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("신비환");
		System.out.print("생일: ");
		System.out.println("722");
		System.out.print("주소: ");
		System.out.println("부산 사상구 주례동");
		System.out.println();
		

	}

}
