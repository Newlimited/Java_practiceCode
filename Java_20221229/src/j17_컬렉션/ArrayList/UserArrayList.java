package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;
@Getter
public class UserArrayList {

	private List<User> userList;
	private Scanner scanner;
	// 생성자 호출시에 객체 생성

	public UserArrayList() {
		
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		System.out.print("아이디:");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("이메일: ");
		email = scanner.nextLine();
		
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		userList.add(user);
	}
	public void printUserList() {
		for(User user : userList)
		{
			System.out.println("아이디\t>" + user.getUsername());
			System.out.println("비밀번호>" + user.getPassword());
			System.out.println("이름t>" + user.getName());
			System.out.println("이메일\t>" + user.getEmail());
		
			System.out.println();
		}
	}
	public void removeUser() {
		String username = null;
		String password = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		for (User user : userList) {
			if (user.getUsername().equals(username)) {
				System.out.println("비밀번호: ");
				password = scanner.nextLine();
			if (user.getPassword().equals(password)) {
				userList.remove(user);
				System.out.println("삭제완료");
				return;
		} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				System.out.println("비밀번호를 다시 입력해 주세요");
				
				return; // 예외처리로 풀어보기 -> 비밃먼호 다시입력해서 하는거
			}
		}
		System.out.println("해당아이디가 없습니다.");
		}
		
}	
	public static void main(String[] args) {

		/*
		 *  [사용자 관리 프로그램]
		 *  1. 사용자 추가
		 *  2. 사용자 리스트 출력
		 *  3. 사용자 삭제
		 *  q. 프로그램 종료.
		 */
		
		UserArrayList userarrayList = new UserArrayList();
		
		while(true) {
			String select = null;
			System.out.println("[사용자 관리프로그램]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램종료");
			System.out.println("메뉴선택>");
			select = userarrayList.getScanner().nextLine();
			if(select.equals("1")) {
				userarrayList.addUser();
			}else if(select.equals("2")) {
				userarrayList.printUserList();
			}else if(select.equals("3")) {
				userarrayList.removeUser();
			}else if(select.equals("q")) {
				System.out.println("프로그램을 중료합니다.");
				break;
				}else {
					System.out.println("해당 번호는 사용할 수 없는 기능입니다.");
				}
			
		}
		
		
	}

}
