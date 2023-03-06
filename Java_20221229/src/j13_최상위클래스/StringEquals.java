package j13_최상위클래스;

public class StringEquals {

	public static void main(String[] args) {
		String name1 = "김철수";
		String name2 = "김철수";
		String name3 = new String("김철수");
		String name4 = name3;

//		name 1,2 는 주소가같은것 . new String 하면서 주소를 새로 만들었기떄문에
//		name 3,4 가같은 주고 즉 2,3 은 다른주소
		
		System.out.println("name1 : "+ name1);
		System.out.println("name2 : "+ name2);
		System.out.println("name3 : "+ name3);
		System.out.println("name4 : "+ name4);

		System.out.println("name1 == name2:" + (name1 == name2));
		System.out.println("name2 == name3:" + (name2 == name3));
		System.out.println("name3 == name4:" + (name3 == name4));
//	 == 는 값 비교가 아니라 주소값 비교
		System.out.println("name1.equals(name2):"+ name1.equals(name2));
		System.out.println("name2.equals(name3):"+ name2.equals(name3));
		System.out.println("name3.equals(name4):"+ name3.equals(name4));
	// equals = 값비교 
	}
	

}
