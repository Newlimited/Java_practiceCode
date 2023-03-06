package j00_연습;

import java.util.ArrayList;

public class Sum {

	public static void main(String[] args) {

		int[] numbers = {1, -2, 3, -5, 8, -3};
		ArrayList<Integer> temp = new ArrayList<>();
		for(int num : numbers) {
			if(num > 0) {
				temp.add(num);
			}
		}
	System.out.println(temp);
		
	
	
//	int[] numbers2 = {1, -2, 3, -5, 8, -3};
//	ArrayList<Integer> temp2 = new ArrayList<>();
//	for(int i = 0 ; i < numbers2.length; i++) {
//		temp2.add(numbers2[i]);
//	}
//	for(int num : temp2) {
//		if(num < 0) {
//		int	n = temp2.get(num);
//
//		System.out.println(n);
//		}
//	}
//System.out.println(temp2);
//	
}
}