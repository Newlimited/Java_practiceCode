package j07_반복;

public class While2 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 아래와 같이 출력되게 while문을 만드시오.
		 * 
		 * 최연호1
		 * 최연호2
		 * 최연호3
		 * 최연호4
		 * 최연호5
		 * 최연호6
		 */
	
	int i = 0;

	String name = "김철수";
	
	while(i < 6) {
		System.out.println(name + (i + 1));
		i++;	
		}
	}
}