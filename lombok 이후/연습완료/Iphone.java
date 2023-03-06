package 연습완료;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Iphone extends PhoneBasic {

	private String model;
	private String color;
	private String memory;

	@Override
	public String toString() {
		ChargeI("8핀 충전기가 필요합니다.");
	return "Iphone [model=" + model + ", color=" + color + ", memory=" + memory + "]";
	}
	
	
}
