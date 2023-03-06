package j18_예외처리;

import java.util.Map;

import lombok.Data;
import lombok.Getter;
@Getter
public class CustomException extends RuntimeException{

	private Map<String, String> errorMap;
	
	public CustomException(String message, Map<String, String> errorMap) {
	 super(message); //super - > 부모인 RuntimneException 에게 주고 
//	 런타임이 부모인 Exception이 부모에게 주고 부모인 Throwable 에게 준다.
//	 detail message 로 준다.
 this.errorMap = errorMap;
	}
	
}