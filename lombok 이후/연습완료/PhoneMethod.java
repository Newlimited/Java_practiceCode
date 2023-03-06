package 연습완료;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
@Getter
@Data
public class PhoneMethod {

	private List<Phone> phoneList;
	private Scanner scanner;

public PhoneMethod() {

	phoneList = new ArrayList<Phone>();
	scanner = new Scanner(System.in);
}
public void addPhone() {
	
	String type = null;
	String model = null;
	String memory = null;
	String color = null;
	
	System.out.print("타입   : ");
	type = scanner.nextLine();
	System.out.print("모델   : ");
	model = scanner.nextLine();
	System.out.print("메모리 : ");
	memory = scanner.nextLine();
	System.out.print("색상   : ");
	color = scanner.nextLine();
	
	Phone phone = Phone.builder()
			.type(type)
			.model(model)
			.memory(memory)
			.color(color)
			.build();
	phoneList.add(phone);
	System.out.println("정보 추가완료");
	}
public void showPhoneList() {
	
	if(phoneList.isEmpty() ) {
		System.out.println("등록된 핸드폰의 정보가 없습니다.");
	}
	for(Phone phone : phoneList) {
		System.out.println("타입   : " + phone.getType());
		System.out.println("모델   : " + phone.getModel());
		System.out.println("메모리 : " + phone.getMemory());
		System.out.println("색상   : " + phone.getColor());
		System.out.println();
		
	}
}
public void removePhoneInfo() {
	
	String phoneModel = null;
	String phoneMemory = null;
	String phoneColor = null;
	System.out.println("삭제하실 모델을 입력해 주세요.");
	phoneModel = scanner.nextLine();
	for (Phone phone : phoneList) {
		if (phone.getModel().equals(phoneModel)) {
			System.out.println("삭제하실 메모리를 입력해 주세요.");
			phoneMemory = scanner.nextLine();
			if (phone.getMemory().equals(phoneMemory)) {
				System.out.println("삭제하실 컬러를 입력해 주세요.");
				phoneColor = scanner.nextLine();
				if (phone.getColor().equals(phoneColor)) {
					phoneList.remove(phone);
					System.out.println("삭제완료");
					return;
				}
				System.out.println("해당 색상의 정보가 존재하지않습니다");
				return;
			}
			System.out.println("해당 메모리의 정보가 존재하지 않습니다");
			return;
		}
		System.out.println("해당 모델의 재고가 없습니다.");
	}
}
public  void showPhoneNumber() {
		int number= 0;
		System.out.println("조회하실 모델을 입력해 주세요");
		String model = scanner.nextLine();
	
		for(Phone phone : phoneList){
			if(phone.getModel().contains(model)){
				number++;
			}
		}
		System.out.println("해당 기종의 재고는 " + number +"개 입니다.");
}

	

}
