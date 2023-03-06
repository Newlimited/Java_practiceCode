package 연습완료;

import java.util.Scanner;

public class 행렬2개의합 {

	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("행렬 갯수를 입력하세요 n X m ");
		n = scan.nextInt();
		m = scan.nextInt();
		
		int[][] b = new int[n][m];
		int[][] d = new int[n][m];

		System.out.println("행렬입력");
	
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
				b[i][j] = scan.nextInt();
		}
		System.out.println();
		}
		System.out.println("두번쨰행렬입력");
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
					d[i][j] = scan.nextInt();
			}
				System.out.println();
		}	
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			System.out.print(b[i][j] + d[i][j]);
		}
		System.out.println();
		}
	

}}
