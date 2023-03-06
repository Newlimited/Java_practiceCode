package j15_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//싱글톤도 스태틱 기반이다.
@Data
@AllArgsConstructor
@Builder
public class Car {
 
	private int carNumber;
	private String company;
	private String model;
	
}
