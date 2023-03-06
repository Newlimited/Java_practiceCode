package j07_반복;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		//구구단
		Scanner scanner = new Scanner(System.in);
		
		
		int dan = 0;
		int num = 0;
		int i = 0;
		System.out.println("몇단을 계산하시 겠습니까? ");
		dan = scanner.nextInt();
		System.out.println(dan+"단입니다.");
	
		while (i < 9){
			
			i++;
			num = dan * i ;
					
		System.out.println(dan + "x" + i + " = "+ num);
		}
	}
}
