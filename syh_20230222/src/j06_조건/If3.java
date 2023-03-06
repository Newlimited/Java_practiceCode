package j06_조건;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		String result = null;
		
		Scanner scanner = new Scanner(System.in);
		double x, y;
	
		System.out.println("x 값을 입력하시오");
		x = scanner.nextDouble();
		System.out.println("y 값을 입력하시오");
		y = scanner.nextDouble();
		
		
		 if( x > 0 && y > 0)
			result = "1사분면 입니다.";
		else if(x < 0 && y > 0) 
			result = "2사분면 입니다.";
		else if (x < 0 && y < 0)
			result = "3사분면 입니다.";
		else { 
			result = "4사분면 입니다.";
	}
		 
		 System.out.println(result);
	}

}
