package j01_출력;

public class Operation1 {

	public static void main(String[] args) {
			
		int score = 95;
		score++;
		System.out.println(score);
		System.out.println(score++);
		System.out.println(score);
		System.out.println(++score);
		System.out.println(score);
		
		System.out.println(--score);
		System.out.println(score--);
		System.out.println(score);
		
		score = 75;
		
		System.out.println(score);
		

		String result = score > 100 || score <0 ? "계산불가"
				:score > 89 ? "A학점"
				:score > 79 ? "B학점"
				:score > 69 ? "C학점"
				:score > 59 ? "D학점"
				:"F학점" ;
				
				System.out.println("결과:" + result);
				
				int a = 50; 
				System.out.println( a > 51 ? "네":"아니요");
					
	}

}
