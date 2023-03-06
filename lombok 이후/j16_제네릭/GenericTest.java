package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<T , E> {
	private E number;
//	private String data;
	
	private T data;
//	T -> A 써도되고 임의적으로 T라 적엇다. 
//	뭘 써야할지 모를때 그냥 T로적고 , Main에 Integer 로 적어서 
//	정수로 쓸것이다를 정의함 그래서 Data에 정수를 적음
}