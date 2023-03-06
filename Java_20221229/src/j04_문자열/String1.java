package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("\"안녕\"하세요");
//		큰따움표 넣는 방법. 앞에 백슬래쉬 넣는다.!
//		백슬래쉬문자(\) = escape 문자

		System.out.println("오늘날씨\t매우\t추움.");

		String address = "부산시 진구 가야동";
		int index = address.indexOf("시");
		
		System.out.println(index);
//				int = 기본자료형 , string = 문자열 자료형
		String address2 = "부산시 동래구 사직동";
		int index2 = address2.indexOf("동");
//		indexOf = 앞에부터 찾다가 멈춤
		System.out.println(index2);
		
		int index3 = address2.lastIndexOf("동");
		System.out.println(index3);
//		lastindexOf =  뒤에서 부터
		
		String subAdderess = address2.substring(0,3);
//		0부터 시작해서 3까지 짤라라..... (띄어쓰기 앞까지)
		System.out.println(subAdderess);
		String subAdderess2 = address2.substring(0,4);
//		0부터 시작해서 4까지( 띄어쓰기 까지, 동 앞까지 ) 
		System.out.println(subAdderess2);
/*
 * 문제 ! 
 * "부산광역시 서구 부민동"에서 indexOf, lastIndexOf 를 사용해서
 * "부산광역시 서구" 까지 출력해라
 */
//		정답 (indexof 랑 lastindexof 를 사용하라는건, "부"가 2개기때문에
//		앞에서 부 , 뒤에서 부 를 찾는다.
//		그러나 정답에서는 띄어쓰기까지 포함되어서 나오기때문에
//		출력시 index5-1 를 하거나 --index5 를 한다.
		String ad = "부산광역시 서구 부민동";
		int index4 = ad.indexOf("부");
		int index5 = ad.lastIndexOf("부");
		System.out.println(index4);
		System.out.println(index5);
		
		String subad2 = ad.substring(index4,index5);
		System.out.println(subad2);
		
//		String ad = "부산광역시 서구 부민동";
//		int index4 = ad.indexOf("부");
//		int index5 = ad.lastIndexOf("구");
//		System.out.println(index4);
//		System.out.println(index5);
//		
//		String subad2 = ad.substring(index4,++index5);
//		System.out.println(subad2);
//		내가 한 방식 ++이나 --를 쓰면 다음 코드에 영향을 미친다.
		
		String replaceAddress = ad.replace(' ', '-');
		System.out.println(replaceAddress);
		
		String replaceAddress2 = ad.replaceAll(" 서","북");
		System.out.println(replaceAddress2);
		/*
		 * 문제 2
		 * 010을 011로 다 바꿔라, /를 -으로 바꿔라, 
		 * ', '를 슬래서(/)로 바꿔라
		 */
		
//		String phoneNumbers = "010/3300/4698, 010/1234/5678";
//		String replacephoneNumbers = phoneNumbers.replace("010","011");
//		String replacephoneNumbers2 = replacephoneNumbers.replace('/', '-');
//		String replacephoneNumbers3 = replacephoneNumbers2.replace(", ","/");
//		System.out.println(replacephoneNumbers3);

		String phoneNumbers = "010/3300/4698, 010/1234/5678";
		String rePhone = phoneNumbers.replaceAll("010","011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/","-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ","/");
		System.out.println(rePhone);
		
		String rePhone2 = phoneNumbers.replaceAll("010","011")
						.replaceAll("/","-")
						.replaceAll(", ","/");
		System.out.println(rePhone2);
	}
 
}