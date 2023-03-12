package 연습완료;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculation {

	int avg(int[] a) {
		int total = 0;
		for (int num : a) {

			total += num;

		}
		return total / a.length;
	}
	int avg(ArrayList<Integer> a) {
		int total = 0;
		for(int num : a) {
			total += num;
		}
		return total / a.size();
	}

	public static void main(String[] args) {

		Calculation cal = new Calculation();
		int[] data = { 1, 3, 5, 7, 9 };
		int result = cal.avg(data);

		System.out.println(result);

		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

		int result2 = cal.avg(data2);
		System.out.println(result2);
		
	}

}
