package 연습완료.C_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class 내림차순 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      System.out.println("정수의 갯수 입력");
	      
	      
	      int n = scan.nextInt();
	      int j = 0;
	      System.out.println("숫자" + n + "개를 입력하세요");
	      int[] numbers = new int[n];
	      for(int i = 0; i < n; i++) {
	         int a = scan.nextInt();
	         numbers[i] = a;
	      }
	      
	      
	      System.out.println("완료");
	      
   
	      Arrays.sort(numbers);
	      printArray(numbers);
	   }


	   private static void printArray(int[] arr) {
	      int[] reN = new int[arr.length];
	      for(int i= 0; i < arr.length; i++) {
	         reN[i] = arr[arr.length - (i + 1) ];
	      }
	      for(int i = 0; i < arr.length; i++) {
	         System.out.println(arr[i]);
	         System.out.println(reN[i]);
	         System.out.println();
	      }
	      
	   }
	}
