package j06_조건;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("x값을 10의 단위로 입력하세요.");
//		
//		int x = scanner.nextInt();
//	
//		switch(x) {
//		case 10:
//			System.out.println("10입니다.");
//		case 20:
//			System.out.println("20입니다.");
//		case 30:
//			System.out.println("30입니다.");
//		case 40:
//			System.out.println("40입니다.");
//		case 50:
//			System.out.println("50입니다.");
//			}
		
		switch(25) {
		
		case 10:
			System.out.println("10입니다.");
		case 20:
			System.out.println("20입니다.");
			break;
		case 30:
			System.out.println("30입니다.");
		case 40:
			System.out.println("40입니다.");
		case 50:
			System.out.println("50입니다.");
		default:
			System.out.println("시작점이 옳지 않습니다.");
		}
//		switch case 는 시작점표시하기위해 사용.
	}
	

}
