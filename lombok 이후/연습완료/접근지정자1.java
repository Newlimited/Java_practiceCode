package 연습완료;

public class 접근지정자1 {
 int a ;
 int b ;

public 접근지정자1() {
}

public void show() {
int num = a + b;
System.out.println(num);
}
public void show2(int a, int b)
{
	int num2 = a + b;
	System.out.println(num2);
}
}
