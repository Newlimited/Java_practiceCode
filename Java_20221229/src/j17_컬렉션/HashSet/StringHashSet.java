package j17_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {

		//Set은 순서가 없다 , 중복허용x 
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		//java 한개만 나온다
		
		set.add("python");
		
		System.out.println(set);
		
		set.add("1");
		set.add("2");
		set.add("3");
		// 순서가 없지만 깊게 들어가면 최소한의 순서가 있다.
		System.out.println(set);
		//set은 순서가 없기때문에 get으로 못뽑는다.
		
//		set.iterator(); // iterator = 줄을 세우는것이다.
		
		Iterator<String> ir = set.iterator();
		
//		System.out.println(ir.hasNext()); // 값이 있는지 물어보는것.
//		System.out.println(ir.next()); // 값이 뭔지 물어보는것.
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
//		System.out.println(ir.next());
//		System.out.println(ir.hasNext());
		
//		while(ir.hasNext()) {
//			System.out.println(ir.next());			
//		}
//		
//		while(ir.hasNext())				{
//			if(ir.next().equals("java")) {
//				System.out.println(ir.next());
//			}
//				} 3이 출력된다. syso 에서 ir.next를 한번더 먹어버렸기때문에..
		while(ir.hasNext()){
			String str = ir.next();
		
			if(str.equals("java")) {
				System.out.println(str);
			}
				} // 그래서 str에 집어 넣어서 출력시킨다.
		// set은 수정이 안되고 직접 찾아서 지우고 추가해줘야한다.
		
	}

}
