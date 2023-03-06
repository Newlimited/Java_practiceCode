package j05_입력;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner9;

public class Input3 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 이름을 입력해 주세요(여러명 입력 가능): 
		 * names = 최연호 최호영 최인선 최백균 강민재 (nextLine)
		 *연락처를 입력해 주세요(여러명 입력 가능):
		 * Phones= 3300 4698, 1234 5678, 1111 2222, 3333 4444, 5555 6666 (nextLine)
		 *
		 * 
		 * 출력
		 * 최연호님, 최호영님, 최인선님,최백균님,  강민재님
		 * 010-3300-4698/010-1234-5678/010-1111-2222/010-3333-4444/010-5555-6666
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		String names, phones = null;
			
		System.out.println("이름을 입력해 주세요 (여러명 입력 가능) : ");
		names = scanner.nextLine();
		
	
		
		System.out.println("연락처를 입력해 주세요(여러명 입력가능) : ");
		phones = scanner.nextLine();	
		
		names = names.replaceAll(" ","님, ") + "님";
		phones = "010-" + phones.replaceAll(" ","-")
				.replaceAll(",","/010");
			
		System.out.println("names : " + names);
		
		System.out.println("phones : " + phones);

		
		
	}

}
