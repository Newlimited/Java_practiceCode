package j07_반복.랜덤;

public class Random1 {

	public static void main(String[] args) {
		double rNum = Math.random();
		System.out.println(rNum);
//	double random = 0 부터 1 까지 실수 랜덤으로 뽑느다.
		
		int i = 0;
		
		while (i < 10) {
			double rNum2 = Math.random();
			System.out.println(rNum2);
			i++;
		}
	
		int j = 0;
		while(j < 10) {
			double rNum3 = Math.random();
			System.out.println((int)(rNum3 * 10));
			j++;
			
		}		
	}
	
}