package 연습완료.A_PhoneList;

import java.util.Scanner;

import lombok.Getter;
@Getter
public class PhoneList {

	public static void main(String[] args) {
		PhoneMethod option = new PhoneMethod();
		while(true) {
			String select = null;
			System.out.println("[폰 재고 관리 프로그램]");
			System.out.println("1. 기종 추가");
			System.out.println("2. 기종 삭제");
			System.out.println("3. 기종 재고조회");
			System.out.println("4. 등록된 기종 리스트");
			System.out.println("q. 프로그램종료");
			System.out.println("메뉴 선택>");
			select = option.getScanner().nextLine();
			
			if (select.equals("1")) {
				option.addPhone();
			} else if (select.equals("2")) {
				option.removePhoneInfo();
			} else if (select.equals("3")) {
				option.showPhoneNumber();
			} else if (select.equals("4")) {
				option.showPhoneList();
			} else if (select.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");

			}

		}
	}
}