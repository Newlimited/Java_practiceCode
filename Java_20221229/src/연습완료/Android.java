package 연습완료;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Android extends PhoneBasic{

	private String model;
	private String color;
	private String memory;
	@Override
	public String toString() {
	ChargeA("C타입 충전기가 필요합니다.");
		return "Android [model=" + model + ", color=" + color + ", memory=" + memory + "]";
	}

	
}
