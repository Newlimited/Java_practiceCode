package j19_익명클래스;

public class Main {

	public static void main(String[] args) {
		System.out.println("[구현클래스]:");
		Addition1 addition1 = new AdditionImpl();

		int result1 = addition1.calc(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		System.out.println("결과1: " + result1);

		System.out.println("[익명클래스]");
		Addition1 addition2 = new Addition1() {
			// 정의와 생성을 동시에 함. 그래서 따로 인플리먼트를 만들 필요가없다.
//			단 1 회성만 사용할 경우 즉 잠시 사용할 것들
			@Override
			public int calc(int[] numbers) {
				int result = 0;

				for (int number : numbers) {
					result += number;

				}
				return result;
			}
		};
		int result2 = addition2.calc(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		System.out.println("결과2: " + result2);

	}

}
