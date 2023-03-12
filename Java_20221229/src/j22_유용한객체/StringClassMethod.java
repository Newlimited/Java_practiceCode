package j22_유용한객체;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class StringClassMethod {

	public static void main(String[] args) {
		String address = "부산 동래구 사직동";
		String name = "YooHanShin";
		boolean containsResult = address.contains("부산");
		printResult("contains", containsResult);

		byte[] getBytesResult = address.getBytes(StandardCharsets.UTF_8);
		printResult("getBytes", getBytesResult); // 바이트로 표현 결과는 B@~~ 물결표에는 16진수
		printResult("getBytes", new String(getBytesResult, StandardCharsets.UTF_8));
		// 16진수를 다시 원래상태로 돌림

		String toLowerCaseResult = name.toLowerCase(Locale.ROOT);
		printResult("toLowerCase", toLowerCaseResult); // 소문자로 바꿔줌

		String toUpperCaseResult = name.toUpperCase(Locale.ROOT);
		printResult("toUpperCase", toUpperCaseResult); // 대문자로 바꿔줌

		char charAtResult = address.charAt(0);
		printResult("CharAt", charAtResult); // i번째 인덱스의 문자를 가져옴

		String concatResult = address.concat(" 중앙대로");
		printResult("concat", concatResult); // 문자열을 합해줌

		printResult("stratsWith", address.startsWith("동래구")); // 해당글자로 시작을 하는지? , endWith 끝나는지?
	
		String[] roles = new String[] {"ROLE_USER",
				"ROLE_GROUP",
				"OWNER",
				"MARSER",
				"ROLE_ADMIN"
				};
		List<String> roleList = new ArrayList<String>();
		
		forEach(role -> {//consumer객체 
			String roleName = (String) role;
			if(roleName.startsWith("ROLE_")) {
				roleName = roleName.substring(roleName.indexOf("_") + 1);
			}
			roleList.add(roleName);
		}, roles); //values
		printResult("StartWith",roleList);
	
		//확장자  .jpg, .exe, .png ...
		List<String> extensions = new ArrayList<String>();
		extensions.add("a.jpg");
		extensions.add("b.jpg");
		extensions.add("c.jpg");
		extensions.add("d.jpg");
		extensions.add("e.jpg");
		extensions.add("f.exe");
		
		extensions.forEach(extension -> {
			if(!extension.endsWith(".jpg")) {
				System.out.println(extension + "은(는) 사용할 수 없는 파일형식입니다.");
			}
		});
		
		boolean equalsIgnoreCaseResult = name.equalsIgnoreCase("yoohanshin"); //대소문자 무시하고 문자비교
		printResult("equalsIgnoreCase", equalsIgnoreCaseResult);
		
		String str = " ";
		
		boolean isEmptyResult = str.isEmpty();
		printResult("isEmpty",isEmptyResult);
		
		boolean isBlankResult = str.isBlank();
		printResult("isBlank", isBlankResult);
	
		String replaceAllResult = address.replaceAll(" ", "-");
		printResult("replaceAll", replaceAllResult);
		
		String[] phoneNumbers = {"010-9988-1916",
				"010/1234/5678",
				"010 2222 3333",
				"01022223333"
				};
			List<String> phoneNumberList = new ArrayList<String>();
			for(int i = 0; i < phoneNumbers.length; i++) {
				String phone = phoneNumbers[i];
				phone = phone.replaceAll("-", "")
						.replaceAll("/", "")
						.replaceAll(" ", "");
				phoneNumberList.add(phone);
			}
			
			printResult("replcaAll", phoneNumberList);
	}
		
	public static void printResult(String methodName, Object result) {
		System.out.println("-----------------");
		System.out.println(methodName + "결과 >>> " + result);
		System.out.println("-----------------");
	}

	public static void forEach(Consumer<Object> consumer, Object[] values ) {
		for(Object value : values) {
			consumer.accept(value);
		}
	}
}
