package 연습완료;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

	private String name;
	private String password;
	private String nickname;
		
}
