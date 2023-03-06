package 연습완료;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 오름차순 {

	public static void main(String[] args) {
		Scanner[] scan = new Scanner[2];
		System.out.println("정수의 갯수 입력");
		
		scan[0] = new Scanner(System.in);
		scan[1] = new Scanner(System.in);
		int n = scan[0].nextInt();
		int j = 0;
		System.out.println("숫자"+ n +"개를 입력하세요");
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
			int a = scan[1].nextInt();
		numbers[i] = a;
		}
		
		 System.out.println("완료");
		
//		 for(int i = 0; i < n; i ++) {
//			 Integer[] reNumbers = new Integer(i)
			 
			 
//	}
		 
		 Arrays.sort(numbers);
//		 Object[] reNumbers = null;
//		Arrays.sort(reNumbers, Collections.reverseOrder());
		 for(j = 0; j < n; j++) {
			System.out.print(numbers[j]);
			System.out.println();
//			System.out.println(reNumbers[j]);
			

		}
	}
}