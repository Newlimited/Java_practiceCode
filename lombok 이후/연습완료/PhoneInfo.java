package 연습완료;

public class PhoneInfo {

	public static void main(String[] args) {
		
		Iphone sixs = new Iphone("6s","roseGold" , "32GB");
		Iphone seven = new Iphone("7","Black" , "64GB");
		Iphone eleven = new Iphone("11","white" , "128GB");
		Iphone fourteen = new Iphone("14","starLight" , "256GB");
		
		Android S10 = new Android("S10", "purple", "64GB");
		Android S21 = new Android("S21", "White", "256GB");
		Android S22 = new Android("S22", "Pink", "256GB");
		Android S23 = new Android("S23", "Shining", "512GB");
		
		System.out.println(sixs);
		System.out.println(seven);
		System.out.println(fourteen);
		System.out.println(S10);
		System.out.println(S21);
		System.out.println(S23);
		
				
	}

}
