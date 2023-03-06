package j00_연습;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int result = 0;
		try {
		int[] a = {1, 2, 3};
		int b = a[3];
		ArrayList<Integer> c = new ArrayList(Arrays.asList("3"));
		int d = (int) c.get(0);
		int e = 4 / 0;
		
	}catch(ClassCastException e) {
		result += 1;
	}catch(ArithmeticException e) {
		result += 2;
	}catch(ArrayIndexOutOfBoundsException e) {// 오류 발생 
		result += 3;
	}finally {
		result += 4;
	}
		System.out.println(result);
	}

}
