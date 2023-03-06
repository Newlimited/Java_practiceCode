package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data  //(setter ,getter, Equals~ , ToString 을 한번에 씀)
public class Student {
	private int studentCode; // final 을 쓰고 값을 주지 않으면 All과 NoArg를 못받는다.
	private String name;
	private int studentYear;
	private int age;
	
	// final, NoNull 이 있으면 무조건 RequiredArgsConstructor을 써줘야한다.
	
	
}
