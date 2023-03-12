package j00_연습;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {
	public int[] solution(int n, int[] numlist) {
		int index = 0;
		List<Integer> numbers = new ArrayList<>();
		for (int number : numlist) {
			if (number % n == 0) {
				numbers.add(number);
			}
		}
		int[] answer = new int[numbers.size()];
		for(int number : numbers) {
			answer[index] = number;
				index++;
			}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}

public class CodingTest {
	public static void main(String[] args) {
		Solution sol1 = new Solution();
		int[] numlist1 = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] numlist2 = { 1, 9, 3, 10, 13, 15 };
		int[] numlist3 = { 2, 100, 120, 600, 12, 12 };
		
		sol1.solution(3, numlist1);
		sol1.solution(5, numlist2);
		sol1.solution(12, numlist3);

	}
//		int[] numlist = {3, 4, 5, 6, 7, 8, 9};
//		int[] answer = new int[10];
//		int index2 = 0;
//		for(int index = 0; index < numlist.length; index++) {
//			if( numlist[index] % 3 == 0) {
//				
//				answer[index2] = numlist[index];
//				index2++;
//			}
//		}
//		System.out.println(Arrays.toString(answer));
//		
//	}

}
