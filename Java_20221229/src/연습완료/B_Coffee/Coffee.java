package 연습완료.B_Coffee;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Scanner;

public class Coffee {
	
	private String Americano;
	private String Tea; 
	private String Latte;

	static void Coffee(String type) {
		HashMap<String, Integer> coffee = new HashMap<>();
		
		coffee.put("Americano", 1500);
		coffee.put("Tea", 5300);
		coffee.put("Latte", 3000);
		
		int price = coffee.get(type);
		System.out.println(price + "원 입니다.");
	}
	static void Order(){	
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요.");
		
		String menu = scan.nextLine();

		Coffee(menu);
	
	}
	public static void main(String[] args) {
		int i = 0;
		Scanner scan = new Scanner(System.in);
		Order();
		
		while(true) {
			System.out.println("재주문 하시겠습니까? Y/N");
			String answer = scan.nextLine();
		if(answer.equals("Y")) {
			Order();
		}else{
		System.out.println("처음으로 돌아갑니다.");
		Order();
		}
		}
	}

}
