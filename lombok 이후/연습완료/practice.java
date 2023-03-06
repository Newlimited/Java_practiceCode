package 연습완료;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("인건비를 설정하세요");
		int A = scan.nextInt();
		System.out.println("제품 가격을 설정하세요");
		int B = scan.nextInt();
		System.out.println("노트북의 가격을 입력하세요");
		int totalPrice = scan.nextInt();

		int totalSoldPrice = 0;
		int c = 0;
		int benefit = 0;
		int i = 0;

		for (i = 0; i < 2139999999; i++) {
			totalSoldPrice = totalPrice * i;
			c = A + (B * i);
			benefit = totalSoldPrice - c;
			if (benefit > 0) {
				break;
			}
		}
		System.out.println(i + "대를 팔았을때가 손익분기점입니다.");
	}

}
