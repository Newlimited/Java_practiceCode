package 연습완료;

public class 형변환연습 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
//	      class자료형
		StringBuilder stringBuilder2 = new StringBuilder();
		
		stringBuilder.append("이름: ");
		stringBuilder.append("신비환");
//		append = 추가
		stringBuilder2.append(stringBuilder.substring(4,7));
		stringBuilder.delete(4,7);
//	delete = 제거	
		System.out.println(stringBuilder2.toString());
		System.out.println(stringBuilder.toString());
				
	}

}
