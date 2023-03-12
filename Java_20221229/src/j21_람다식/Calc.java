package j21_람다식;

@FunctionalInterface
public interface Calc {

	public Integer operator(Integer[] data);
//	public Integer operator2(Integer[] data, Integer num); 
//	이렇게 두개 쓰면 메인에서 람다를 쓸 수 없다. 
// 람다를 사용하기 위한 인터페이스 경우 FunctionalInterface라는 어노테이션을 달아준다.
	// 그럼 메소드를 한개 더 쓸 수가 없게 만들어진다.
	// 협업시 다른사람이 한개 더 추가 해서 쓰지 못하게 알려주는역할. 
/*
 * 함수형 인터페이스
 * java.lang.Runnable  메서드 void run() 매게변수x  반환값x
 * Supplier<T>  메서드 T get() 매게변수x 반환값 o
 * Consumer<T> void accept(T t) <소비자, 받은걸 소비하고 반환값x> 매게변수 o 반환 x
 * Function<T, R> R apply(T t)  인풋 아웃풋이 있다. T가 변수타입 R이 리턴타입 매게변수 o 반환 o
 * Predicate<T> boolean test<T t>  True , False 를 리턴 
 */
}
