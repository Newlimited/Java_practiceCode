package 연습완료;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ListSetHashMap {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Woo-Young Woo");
		name.add("CartRiderPlus");
		name.add("Name of Cart is Frozen Monster");
		
		System.out.println(name);
		
		for(int i = 0; i< name.size(); i++) {
		System.out.println(name.get(i));
		}

		int findName = name.indexOf("Name of Cart is Frozen Monster");
		System.out.println(findName);
		
		name.remove(findName);
		name.add(findName, "She will change her cart \n to New Season Cart from now Cart");
		
		System.out.println(name);

		HashMap<String, String> records = new HashMap<String, String>();
		
		records.put("고가", "1분 50");
		records.put("만리장성", "1분 55");
		records.put("비치트랙", "1분 47");
		records.put("해숨보", "2분 35");
		System.out.println(records);
		Scanner scan = new Scanner(System.in);
		System.out.println("기록을 조회할 맵이름을 적으세요:");
		for(int i = 0; i < 5; i ++) {
		String recordsName = scan.nextLine();
		if(records.containsKey(recordsName)){
		System.out.println(records.get(recordsName) + "초");
		break;
		}else {
			System.out.println("해당맵의 기록이 존재하지 않습니다.");
		System.out.println("다시 기입하세요");
		}}
		System.out.println("기록조회를 5회 초과 하셨거나 조회성공하였습니다."
				+ " \n 계속 조회를 원하신다면 프로그램을 다시 실행시켜주세요");
		
	
}
}

