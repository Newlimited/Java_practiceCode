package j18_예외처리;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class User {
	private String username;
	private String password;
}

public class ExceptionTest {

	public static void main(String[] args) {
		User user = new User("aaa","1234");
		User user2 = new User("bbb","1111");
		User user3 = new User("ccc","2222");
		User user4 = new User("ddd","3333");
		User user5 = null;
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(user);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);

		try {
//			if (1 == 1) { // 오류를 강제로 발생시킴 -> Exception e 로 바로넘어감
//				throw new RuntimeException();
//			}
			for (int i = 0; i < userList.size(); i++) {
				System.out.println(i + 1 + "번 회원");
				System.out.println(userList.get(i).getUsername());
				System.out.println(userList.get(i).getPassword());
				System.out.println();
			}
	} catch (NullPointerException e) {
		System.out.println(e.getMessage()); // 에러 메세지를 본다.
		e.printStackTrace();// 에러메시지를 볼수 있다.
		System.out.println("회원의 정보가 없습니다.");
	} catch (IndexOutOfBoundsException e) {
		System.out.println("인덱스 참조가 배열의 크기를 벗어났습니다.");
	} catch (Exception e) {
		System.out.println("모든 예외를 다 처리 가능하다.");
	}
	System.out.println("프로그램 정상종료");
}
}