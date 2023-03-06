package j10_배열;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// 정수배열
		int[] numbers = new int[5]; // 방이  총 5개가 잇는 배열이다~
		
		// 문자열 배열
		String[] names = new String[5];
		
		// 객체 배열
		Scanner[] scan = new Scanner[5];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[3] = 15;

		names[4] = "문자열";
		
		scan[0] = new Scanner(System.in);
		scan[2] = new Scanner(System.in);

	}

}
