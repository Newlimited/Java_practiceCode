package j07_반복;

public class DoubleWhile2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 중첩반복 문제
		 * 
		 * 1교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		2분
		 * 		...
		 * 		10분
		 * 2교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		2분
		 * 		...
		 * 		10분
		 * 3교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		2분
		 * 		...
		 * 		10분
		 * 4교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 		10분 쉬는시간
		 * 		1분
		 * 		2분
		 * 		...
		 * 		10분
		 * 
		 */
	
		int i = 0;
		int j = 0;

		while (i < 4) {
			System.out.println(i + 1 + "교시");
			i++;
			j = 0;

			while (j < 50) {
				System.out.println("\t" + (j + 1) + "분");
				j++;

			}
			if (j == 50) {

				j = 0;
				System.out.println("\t10분 쉬는시간");

				while (j < 10) {
					System.out.println("\t" + (j + 1) + "분");
					j++;
				}
			}
		}
//		j 를 60 까지 돌리고 if else 를 써서 50 /10 으로 끊어도 됨.
	}
}