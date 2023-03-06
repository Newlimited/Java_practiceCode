package j06_조건;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// 돈이 있으면 택시를 타고 가고 돈이 없으면 걸어가라.

//		boolean money = false;
//		if(money)System.out.println("택시를 타고 가라");
//		System.out.println("잔돈을 받아라");
//	
//		if(!money)System.out.println("걸어가라");
//	
		boolean money = false;
		if (money) {
			System.out.println("택시를 타고 가라");
		}

		if (!money) {
			System.out.println("걸어가라");
		}
//		ctrl + shift + f = 자동정렬 단축키

		
		boolean money2 = true;
		if (money2) {
			System.out.println("택시를타고가라");
		} else {
			System.out.println("걸어가라");
		}
		/*
		 * if 문의 기본 구조
		 * if(조건문) {
		 * 			<수행할 문장 1>;
		 * 			<수행할 문장 2>;
		 * 			...
		 * }else{
		 * 			<수행할 문장 a>;
		 * 			<수행할 문장 b>;
		 * 			...
		 * }
		 * 
		 */
	
	}

}
