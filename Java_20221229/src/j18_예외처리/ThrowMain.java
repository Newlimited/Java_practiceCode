package j18_예외처리;

import java.util.HashMap;
import java.util.Map;

public class ThrowMain {

	public static void main(String[] args) {
		try {
			Map<String, String> errorMap = new HashMap<String, String>();
			errorMap.put("username", "아이디는 비어있을 수 없습니다.");
			errorMap.put("password", "비밀번호는 비어있을 수 없습니다.");
			throw new CustomException("오류를 강제로 생성",errorMap);
			
		} catch (CustomException e) {
			e.printStackTrace();
			System.out.println(e.getErrorMap());
//			CustomException 이 RuntimeException 을 상속 받았기 때문에 가능하다.
		}
		System.out.println("예외 바로 밑에는 로직을 작성 할 수 없다.");
	}
	

}
