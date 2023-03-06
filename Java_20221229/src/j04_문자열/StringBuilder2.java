package j04_문자열;

public class StringBuilder2 {

	public static void main(String[] args) {
		String names = "최연호님, 김유정님, 박민재님, 지수연님";
		
		StringBuilder stringBuilder = new StringBuilder();
		/*
		 * 문제1
		 * 이름만 잘라서 슬러시로 구분해서 넣기
		 * 결과물 : 최연호/김유정/박민재/지수연
		 * 
		 * 문제2
		 * 결과물 : 최연호김유정박민재지수연
		 */
//		
//		stringBuilder.append(names.substring(0, 3))
//		.append("/")
//		.append(names.substring(6, 9))
//		.append("/")
//		.append(names.substring(12,15))
//		.append("/")
//		.append(names.substring(18,21));
//		
//		
//		System.out.println(stringBuilder.toString());
//		
//		문제 1-1
		int index = names.indexOf("님");
		stringBuilder.append(names.substring(index - 3, index))
		.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index))
		.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index))
		.append("/");
		
		index = names.indexOf("님", index + 1);
		stringBuilder.append(names.substring(index - 3, index));
		
		System.out.println(stringBuilder.toString());
//	문제2
		
		
		int index2 = stringBuilder.lastIndexOf("/");
		stringBuilder.delete(index2, index2+1);
		
		index2 = stringBuilder.lastIndexOf("/" , index2 - 1);
		stringBuilder.delete(index2, index2 + 1);
		
		index2 = stringBuilder.lastIndexOf("/" , index2 - 1);
		stringBuilder.delete(index2, index2 + 1);
		
		System.out.println(stringBuilder.toString());
	

	}
}