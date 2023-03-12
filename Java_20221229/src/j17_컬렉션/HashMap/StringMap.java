package j17_컬렉션.HashMap;

import java.util.HashMap;

public class StringMap {

	public static void main(String[] args) {
		//변수가 두개라서 상속을 못받는다.
		// Key , Value
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();
		
		HashMap<String, String> strMap2 = new HashMap<String, String>();
		
		 strMap.put(1, "java");
		 strMap.put(1, "java");
		 strMap.put(1, "java");
		 strMap.put(1, "java");

		 System.out.println(strMap);
		 
		 strMap.put(1, "java1");
		 strMap.put(1, "java2");
		 strMap.put(1, "java3");
		 strMap.put(1, "java4");
		 
		 System.out.println(strMap);
	
		 strMap.put(20, "java1");
		 strMap.put(30, "java1");
		 strMap.put(40, "java1");
		 strMap.put(50, "java1");
		 //key 가 같으면 중복이 안되서 마지막이 출력이된다 , value 는 중복 허용된다 key만 다르면...
		 System.out.println(strMap);
//		 맵은 foreach가 안된다. iterator 써줘야한다.
		 
//		 for(String value : strMap) {
//			 System.out.println(value);
//		 }
		 
		 
		 
	}

}