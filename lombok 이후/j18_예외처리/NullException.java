package j18_예외처리;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student{
//	여기서 만드는 class 는 다른 패키지에서 사용안됨

	private String studentNmae;
	private String studentYear;	
}

public class NullException {

	public static void main(String[] args) {

		Student student = null; // 주소를 생성 안하면  NullException 이라뜬다.
		try {
		System.out.println(student.getStudentNmae());
	}catch(NullPointerException e) {
		System.out.println("주소가 비었습니다.");
		System.out.println(Student.class.getSimpleName() + "객체를 생성해 주세요");
	}
	}
}
