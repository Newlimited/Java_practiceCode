package Exam;

import java.sql.Date; // 날짜 데이터 형식
import java.text.SimpleDateFormat; // 날짜형식 변환
import java.util.UUID; // 회원번호 랜덤 고유 번호지정

/*A 사는 고객 관리를 위해 새로운 시스템을 구축하려 한다.
고객 정보는 (UUID 형식의 고객번호), (이름), (성별), 
(yyyy. MM. dd. 형식의 생성 당시 날짜), (주소), (전화번호), 
(마케팅 수신 여부), (개인정보 수집 동의 여부) 로 구성되어있다고 한다.

이때 Java 언어로 고객 정보 관련 class를 생성하고 각 필드는 외부에서 직접 접근할 수 없으며 
메서드를 통해서 접근 및 수정 할 수 있도록 작성할 예정이며

해당 클래스로 객체를 생성할 때 모든 값이 입력되어야 하지만 
사용자로부터 (이름), (성별), (주소), (전화번호), 
(마케팅 수신 여부), (개인정보 수집 동의 여부)만 받는다고 할때

해당 class를 클래스 명명 규칙, 변수 명명 규칙, 함수 명명 규칙을 준수하여 작성하시오. 
(pacakge 및 import 포함 제출)

- 특정 class 혹은 library를 import하였다면 해당 import를 한 이유를 작성하시오.*/

public class Test2 {
	private String customNumber;
	private String customName;
	private String gender;
	private String regitDate;
	private String address;
	private String telNumber;
	private boolean agreeReceiveMarketing;
	private boolean agreeCollectingPersonalInfo;

	public Test2(String customName, String gender, String address, String telNumber, boolean agreeReceiveMarketing,
			boolean agreeCollectingPersonalInfo) {
		Date now = new Date(0);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy. MM. dd");
		this.customNumber = UUID.randomUUID().toString();
		this.customName = customName;
		this.gender = gender;
		this.regitDate = simpleDateFormat.format(now);
		this.address = address;
		this.telNumber = telNumber;
		this.agreeReceiveMarketing = agreeReceiveMarketing;
		this.agreeCollectingPersonalInfo = agreeCollectingPersonalInfo;
	}
	public String getCustomNumber() {
		return customNumber;
	}

	public void setCustomNumber(String customNumber) {
		this.customNumber = customNumber;
	}

	public String getCustomName() {
		return customName;
	}

	public String getRegitDate() {
		return regitDate;
	}

	public void setRegitDate(String regitDate) {
		this.regitDate = regitDate;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public boolean isAgreeReceiveMarketing() {
		return agreeReceiveMarketing;
	}

	public void setAgreeReceiveMarketing(boolean agreeReceiveMarketing) {
		this.agreeReceiveMarketing = agreeReceiveMarketing;
	}

	public boolean isAgreeCollectingPersonalInfo() {
		return agreeCollectingPersonalInfo;
	}

	public void setAgreeCollectingPersonalInfo(boolean agreeCollectingPersonalInfo) {
		this.agreeCollectingPersonalInfo = agreeCollectingPersonalInfo;
	}

	public Test2() {
		super();
	}


}
