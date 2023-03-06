package j06_조건;

public class If2_2 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 
		 * "돈이 3000원 이상 있고 카드가 있다면 택시를 타고, 돈이 3000원 이하이고 카드만 있다면
		 * 버스를 타라, 그렇지 않으면 걸어가라"
		 *
		 */
	boolean card = true;
	int money = 3200;			
	
	if (money >= 3000 && card) 
		System.out.println("택시를 타라");
	
	else if (money <= 3000 && card)
		System.out.println("버스를 타라");

	else
		System.out.println("걸어가라");
		
	}

}