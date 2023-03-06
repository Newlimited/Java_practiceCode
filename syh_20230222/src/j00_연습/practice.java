package j00_연습;

public class practice {
	public static void main(String[] args) {
		int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
		int total = 0;
		for(int mark : marks){
			total += mark;
			
		}
		float average = (float) total / marks.length;
		
		System.out.println(average);

		int i = 0;
		i++;
		System.out.println(i);
				
	}

}