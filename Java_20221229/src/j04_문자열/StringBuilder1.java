package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
//	      class자료형
		stringBuilder.append("이름: ");
		stringBuilder.append("신비환");
//		append = 추가
		
		stringBuilder.delete(4,7);
//	delete = 제거	
		System.out.println(stringBuilder.toString());
	}

}
