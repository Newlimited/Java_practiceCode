package j15_스태틱;

import lombok.Data;

@Data
public class Student {

	public static int autoCode = 20230000;
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = ++autoCode;
		this.name = name;
	}
}
