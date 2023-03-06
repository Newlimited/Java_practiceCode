package j03_연산자;

public class Operation2 {

	public static void main(String[] args) {
//		줄 전체 지울 때 ctrl + d
//		관계연산자
		System.out.println(10 > 5);
		
//		기준은 왼쪽으로 잡는다. 10이 5보다 크냐?o ,, 5가 10보다 작냐? x
		
		boolean result = 10 > 5;
		System.out.println(result); 
		
		boolean result2 = 10 == 5 ;
//		== 같냐? 의문형
		System.out.println(result2);
		
		boolean result3 = 10 < 5;
		System.out.println(result3);
		
		boolean result4 = 10 != 5;
		System.out.println(result4);
		System.out.println("" + result + result2);
		
//		System.out.println(result + result2); 
//		boolean 끼리는 산술처리가 안된다.
		/*
		 *  장문 주석 = /*  
		 *  논리연산 : boolean 끼리 연산 하는것
		 *  true = 1 , false = 0 으로 생각하면 편하다.
		 *  AND 연산 (&&) - 곱
		 *  true && true => true
		 *  true && false => false 
		 *  false && false => false
		 *  
		 *  OR연산 (||) - 합
		 *  true || true => true
		 *  true || false => true		
		 *  false || false => false
		 *  
		 *  NOT 연산 (!) - 부정
		 *  !true => false
		 *  !false => true
		 *  
		 *  !(true && false) => true
		 */

		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0 && 2000 % 5 == 0);
		
	}

}
