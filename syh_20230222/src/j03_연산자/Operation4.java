package j03_연산자;

public class Operation4 {

	public static void main(String[] args) {
		/*
		 * 윤년
		 * 해당 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수일 때
		 * 
		 * 
		 * 삼항 연산자.
		 */
		
	 int year = 1500;
	 String result = year % 4 == 0
			 		&& (year % 100 != 0 || year % 400 == 0)? "윤년" 
			 				: "윤년아님";
//		결과값이 문자열이기 때문에 자료형은 String 을 쓴다.
	 
	 System.out.println(result);
	 
	 System.out.println(year > 2000 ? "2000보다 큼"
			 	    :year > 1000 ? "1000보다 큼"
			 		:year > 500 ? "500보다 큼"
			 					:"500이하");
	 
	 	
		
	}

}