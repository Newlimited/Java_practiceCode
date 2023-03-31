package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Users {
	Scanner scanner = new Scanner(System.in);
	private String email;
	private String name;
	private String password;
	private String passwordCheck;
	private String phoneNumber;
	List<Users> userList = new ArrayList<>();
	public Users(){}
	public Users(String email, String name, String password, String phoneNumber) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordCheck() {
		return passwordCheck;
	}
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void addUser() {
		while (true){
			System.out.print("이메일 : ");
			email = scanner.nextLine();
			System.out.print("비번 : ");
			password = scanner.nextLine();
			System.out.print("비번확인 : ");
			passwordCheck = scanner.nextLine();
			System.out.print("이름 : ");
			name = scanner.nextLine();
			System.out.print("폰번 : ");
			phoneNumber = scanner.nextLine();
		if (isEmpty()) {
			System.out.println("모두 입력 하세요 ");
			continue;
		}
		if (checkEmail()) {
			System.out.println("이메일 중복입니다. ");
			continue;
		}
		if (checkPassword()) {
			System.out.println("비밀번호가 맞지 않습니다.");
			continue;
		}
		System.out.println("계정을 생성합니다.");
		makeList();
		System.out.println();
		if (quit()){
			System.out.println("계정리스트를 생성합니다.");
			showUserList();
			break;
		}
		continue;
	}
}
		public boolean checkEmail() {
		boolean result = false;
		for (Users users : userList) {
			if (users.getEmail().equals(email)) {
				result = true;
			}
		}
		return result;
	}
	public boolean checkPassword() {
		boolean result = !(password.equals(passwordCheck));
		return result;
		}
	public boolean isEmpty() {
		boolean result = email.isBlank() ||
				password.isBlank()||
				passwordCheck.isBlank()||
				name.isBlank()||
				phoneNumber.isBlank();
		return result;
	}
	public void makeList() {
		userList.add(new Users(email, name, password, phoneNumber)); 
	}
	public boolean quit() {
		boolean result = true;
		System.out.println("프로그램을 종료 하시겠습니까? Y/N  ");
		String answer = scanner.nextLine();
		if(answer.equals("Y")) result = true;
		if(answer.equals("N")) result = false;
		
		return result;
	}
	public void showUserList() {
		for(Users showUserList : userList) {
			System.out.println(showUserList.toString());
		}
	}
	@Override
	public String toString() {
		return "사용자 목록 [이메일 = " + email + ", 비밀번호 = " + password +", 이름 = " + name  + ", 전화번호 = " + phoneNumber + "]";
	}
}