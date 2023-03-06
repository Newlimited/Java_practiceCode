package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		/*
		 * Framework
		 * List = 순서가 있음 , 중복허용
		 * Set = 순서 x 중복허용x
		 * Map = 순서 x 중복허용x 값은 중복가능. 키와 값의 한쌍으로 이루어지는 데이터집합
		 * 
		 * 콜렉션인터페이스 메소드
		 * boolean add 요소추가 , void clear 모든요소 제거
		 * boolean contains 객체 포함확인 , equals 같은지확인
		 * isEmpry 비어이는지확인 , iterator<E> iterator .......등등
		 */
		ArrayList<String> list = new ArrayList<String>();
		// 값 추가
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("html");
		
		// 원하는 위치에 값 추가
		list.add(1, "css");
		
		System.out.println("list 크기: " + list.size());
		
		
		System.out.println(list);
		
		//리스트에서 해당 인덱스로 값 찾기.
		String subject = list.get(0);
		
		System.out.println("0번 인덱스의 값 : " + subject); 
		
		//값으로 인덱스 찾기
		int findIndex = list.indexOf("python");
		System.out.println("python이 있는 위치 :" +  findIndex);
	
		//해당 인덱스 위치에 값을 수정set , 삭제 = remove
		list.set(3, "C++");
		System.out.println(list);
	
		// 해당 리스트가 값을 포함하고 있는지 확인 contains,containsall
		// 두 list에 담겨있는지 모두 확인 = constainsAll
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("python");
		tempList.add("C++");
		tempList.add("spring");
		
		//list 부터확인
		boolean contains = list.contains("java");
		boolean containsAll = list.containsAll(tempList);
		
		System.out.println("contains : " + contains);
		System.out.println("containsAll : " + containsAll);
		
		//다른 컬렉션의 데이터를 모두 추가
		list.addAll(tempList);
		System.out.println(list);
		
		//삭제 , removeAll = 다른컬렉션의 데이터를 모두 삭제 
		//그리고 해당 컬렉션의 데이터와 동일한 기존데이터까지 모두 삭제
		
//		list.remove("python");
//		System.out.println(list.remove("python"));
		System.out.println(list); 
		
//		list.remove(5);
		System.out.println(list);
		
//		list.removeAll(tempList);
		System.out.println(list);
		
//		retainAll = 해당 컬렉션과 동일한 데이터를 제외하고 기존데이터값 모두 삭제
		list.retainAll(tempList);
		System.out.println(list);
		
		//리스트가 비어있는지 확인
		System.out.println(list.isEmpty());
		//리스트 전체 지우기
		
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
//		리스트에 배열넣기
		Arrays.asList(new String[] {"java","python", "c++","html"});
//		asList 가 배열을 만들어주는역할 asList는 배열을 => ArrayList로 반환해줌
		
		List<String> asList2 = Arrays.asList(new String[] {"java","python", "c++","html"});
		System.out.println(asList2);
		

		list.addAll(asList2);
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("<<<foreach>>>");
//		foreach = 끝까지 돌면서 하나씩 들고오는거.0
		for(String str: list) {
			System.out.println(str);
		}
		
		String roles = "USER,ADMIN,TEST_USER";
		//쉼표로 구분해서 배열에 넣기
		String[] roleArray = roles.split(",");
		System.out.println(roleArray[0]);
		System.out.println(roleArray[1]);
		System.out.println(roleArray[2]);
		
		//배열을 리스트로 만들기
		Arrays.asList(roleArray);
		
		//출력
		// 람다식 (->) 사용
		Arrays.asList(roleArray).forEach(arg ->
		{System.out.println("role: " + arg);
		});
				
	}
}