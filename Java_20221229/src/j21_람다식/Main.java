package j21_람다식;

public class Main {

	public static void main(String[] args) {
		Calc anonymousAddition = new Calc() {

			@Override
			public Integer operator(Integer[] dataArray) {
				int result = 0;

				for (int data : dataArray) {
					result += data;
				}
				return result;
			}
		};
		//람다는 인터페이스에 메소드가 하나만 있어야한다.
		// 람다는 new Calc를 제거한다. 그럼 두개를 사용할시 누구를 구현해야할지
		// 알 수가 없다.
		//람다식
		Calc lambdaAddition = (nums) -> { //nums 가 매개변수 자료형을 쓰지않는이유는
			//위에서와 같이 메소드를 한개만 구현하기때문에 메소드는 정해져있다.
			// 단 매개변수를 두개를 쓸땐 괄호로 묶어야한다.
			int result = 0;

			for (int num : nums) {
				result += num;
			}
			return result;
		}; // 중괄호,return 생략 가능하다.
		//단, 무조건 바로 리턴일경우에만 즉 메소드내용이 없을 때 
		//메소드 자체에 리턴이 있어야함.
		Calc lambdaMultiplication = nums -> {
			int result = 1 ;
			for(int data : nums) {
				result *= data;
				}
			return result;
		};
		
		Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//일반
		int result1 = anonymousAddition.operator(numbers);
		System.out.println("결과1: " + result1);
		//람다
		int result2 = lambdaAddition.operator(numbers);
		System.out.println("결과2 : " + result2);
		int result3 = lambdaMultiplication.operator(numbers);
		System.out.println("결과3 :" + result3);
	}

}
