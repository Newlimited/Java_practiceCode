package 연습완료;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import lombok.Getter;

@Getter
public class UserList {

	private List<User> userlist;
	private Scanner scan;

	public UserList(){
		userlist = new ArrayList<User>();
		scan = new Scanner(System.in);
	}
	public void addUser() {
		String name = null;
		String password = null;
		String nickName = null;
	System.out.print("유저이름 : ");
	name = scan.nextLine();
	System.out.print("비밀번호 : ");
	password = scan.nextLine();
	System.out.print("닉네임   : ");	
	nickName = scan.nextLine();
	User user = User.builder()
			.name(name)
			.password(password)
			.nickname(nickName)
			.build();
	userlist.add(user);
	System.out.println("계정 추가 완료");
	}
		
	public void printUserList() {
		if(userlist.isEmpty()) {
			System.out.println("등록된 계정이 없습니다.");
			System.out.println();
		}
		for(User user : userlist){
		System.out.println("아이디 :\t" + user.getName());
		System.out.println("비밀번호 : " + user.getPassword());
		System.out.println("닉네임 \t:" + user.getNickname());
	
		System.out.println();
		}
		
	}
	public void removeUser() {
		 String nickName = null;
		 String password = null;
		 for(User user : userlist) {
		 System.out.println("닉네임을 입력하세요 : ");
		 nickName = scan.nextLine();
			if (user.getNickname().equals(nickName)) {
				System.out.println("비밀번호를 입력하세요 : ");
				password = scan.nextLine();
			if (user.getPassword().equals(password)) {
				userlist.remove(user);
				System.out.println("삭제완료");
						return;
					} 
				System.out.println("비밀번호가 틀렸습니다.");
						return;
			}
			System.out.println("해당하는 아이디가 없습니다.");
		}				
	}
	
	public static void main(String[] args) {
		UserList userlist = new UserList();
		while(true) {
		String select = null;
		System.out.println("계정 관리 프로그램");
		System.out.println("1. 계정 추가");
		System.out.println("2. 계정 리스트 출력");
		System.out.println("3. 계정삭제");
		System.out.println("q. 프로그램종료");
		System.out.println("메뉴선택");
		
		select = userlist.getScan().nextLine();
		if(select.equals("1")) {
			userlist.addUser();}
		else if(select.equals("2")) {
			userlist.printUserList();
		}else if(select.equals("3")) {
			userlist.removeUser();}
		else if(select.equals("q")) {
			System.out.println("프로그램을 종료합니다.");
			break;}
		else 
		{
		System.out.println("키를 잘못 입력 하셨습니다.");}
		}
		}
}