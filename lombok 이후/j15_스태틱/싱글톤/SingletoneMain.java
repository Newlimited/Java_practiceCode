package j15_스태틱.싱글톤;

public class SingletoneMain {

	public static void main(String[] args) {
		// 접근지정자가 private 라서 외부에서 호출 할 수 없다.
//		KIA kia = new KIA(); 
	
	
		KIA kia = KIA.getInstance();
		kia.produceCar("k3");
		System.out.println(kia.produceCar("k3"));
		
		KIA kia2 = KIA.getInstance();
		KIA kia3 = KIA.getInstance();
		KIA kia4 = KIA.getInstance();
		KIA kia5 = KIA.getInstance();

		System.out.println(kia2.produceCar("k3"));
		System.out.println(kia3.produceCar("k5"));
		System.out.println(kia4.produceCar("k7"));
		System.out.println(kia5.produceCar("k8"));

		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		
	
	}

}
