package j08_메소드;

public class Method2 {
	// 메소드 종류  void 가 있기때문에 리턴값이 없다.
	
	
	// 반환도 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	// 반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("num : " + num);
		System.out.println("test3 메소드 호출");
		
	}
	
	// 반환이 없고 매개변수가 두개인 메소드
	public static void test3(int num, String num2) {
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println("test3 메소드 호출");
	}
	
	// 반환이 있고 매개변수가 없는 메소드
	
	public static int test4() {
		System.out.println("test4 메소드 호출");
		return 100;
	}
	
	// 반환도 있고 매개변수도 있는 메소드
	public static String test5(String name, int index) {
		System.out.println("name:" + name);
		System.out.println("index: "+ index);
		return name + index;
		
		
	}
	
	public static void main(String[] args) {
		test1();
		test2(10);
		test3(1111,"가나다");
		int a = test4();
		System.out.println();
		System.out.println(a);
		System.out.println();
		
		String result = test5("김철수", 1);
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println(test5("김철수", 1));		
		}
}