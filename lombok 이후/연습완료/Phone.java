package 연습완료;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Phone {

	private String type;
	private String model;
	private String memory;
	private String color;
	

}
