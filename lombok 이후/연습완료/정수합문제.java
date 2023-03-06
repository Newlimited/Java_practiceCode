package 연습완료;

import java.util.Scanner;

public class 정수합문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.println("정수 갯수를 입력하세요.");
			int n = scan.nextInt();
			int sum = 0;
			
			System.out.println("정수를 입력하세요");
			int a = scan.nextInt();

			while(a != 0){
				sum += a%10;
				
				a = a/10 ;
			}
			System.out.println(sum);
		
		}	

	
}