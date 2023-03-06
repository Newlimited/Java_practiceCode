package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 이름 : 최연호			next()		 변수명 : name
		 * 생일 : 624				nextInt() 		 	birth
		 * 주소 : 부산 진구 가양동  nextLine()			address
		 * 연락처 : 010-3300-4698	next()				phone
		 * 
		 * 출력 .
		 * 사용자의 이름은 최연호이고 생일은 624 입니다.
		 * 주소는 부산 진구 가양동에 거주중입니다.
		 * 연락처는 010-3300-4698 입니다.
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
			
		String name, address, phone = null;
		int birth = 0;
		
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("생일ex)월일722: ");
		birth = scanner.nextInt();
		
		scanner.nextLine();
//			nextLine 은 앞의 엔터까지 받아들인다. 그래서 넥스트 라인전에는
//		엔터를 날릴 수 있는 scanner.nextLine()을 적어 줘야함.
		System.out.println("주소: ");
		address = scanner.nextLine();
		
		
		System.out.println("연락처(-붙여주세요): ");
		phone = scanner.next();
		
		System.out.println("출력\n사용자의 이름은" + name + "이고,");
		System.out.println("생일은 "+birth +"입니다.\n"	
							+ "주소는 " + address +"에 거주중입니다.\n"
							+ "연락처는" + phone +"입니다.");
		
				
	}

}
