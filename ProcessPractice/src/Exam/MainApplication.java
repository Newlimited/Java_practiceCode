package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User2 {
	String email;
	String password;
	String name;
	String phoneNumber;

}

public class MainApplication {
	public static void main(String[] args) {
		List<User2> userList = new ArrayList<>();
		String email;
		String password;
		String name;
		String phoneNumber;
		String passwordCehck;

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("이메일 : ");
			email = scanner.nextLine();
			System.out.print("비밀번호 : ");
			password = scanner.nextLine();
			System.out.print("비밀번호체크 : ");
			passwordCehck = scanner.nextLine();
			System.out.print("이름 : ");
			name = scanner.nextLine();
			System.out.print("전화번호 : ");
			phoneNumber = scanner.nextLine();
			boolean isBlank = email.isBlank() || password.isBlank() || passwordCehck.isBlank() || name.isBlank()
					|| phoneNumber.isBlank();
			if (isBlank) {
				System.out.println("모두입력하세요");
				continue;
			}
			for (User2 user : userList) {
				boolean chekcEmail = user.email.equals(email);
				if (chekcEmail) {
					System.out.println("이메일 중복");
					return;
				}
			}
			boolean isEqualsPassword = !(password.equals(passwordCehck));
			if (isEqualsPassword) {
				System.out.println("비밀번호 불일치");
				return;
			}
			User2 user = new User2();
			user.email = email;
			user.password = password;
			user.phoneNumber = phoneNumber;
			user.name = name;
			
			userList.add(user);
			System.out.println(toString(user));
		}
		
	}

	public static String toString(User2 user) {
		return "이메일 : " + user.email + "\n비밀번호 :" + user.password + "\n이름 : "+ user.name +"\n번호 : " + user.phoneNumber;
	}

}
