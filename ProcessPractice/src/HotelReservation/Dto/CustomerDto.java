package HotelReservation.Dto;

import java.util.Scanner;

public class CustomerDto {
	private String name;
	private String telNumber;
	private int countOfReservation;
	
	public CustomerDto(String name, String telNumber, int countOfReservation) {
		this.name = name;
		this.telNumber = telNumber;
		this.countOfReservation = countOfReservation;
	}
	public CustomerDto() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public int getCountOfReservation() {
		return countOfReservation;
	}
	public void setCountOfReservation(int countOfReservation) {
		this.countOfReservation = countOfReservation;
	}
	@Override
	public String toString() {
		return "CustomerDto [name=" + name + ", telNumber=" + telNumber + ", countOfReservation=" + countOfReservation
				+ "]";
	}
	public void reservationInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("예약자 이름 : ");
		name = scanner.nextLine();
		System.out.print("폰 번호 :  ");
		telNumber = scanner.nextLine();
		System.out.println("예약 인원 수 : ");
		countOfReservation = scanner.nextInt();
	}
	
	public boolean isEmpty() {
		boolean result = name.isBlank() ||
				telNumber.isBlank();
		return result;
	}
	public boolean reservationCount() {
		boolean result;
		if(countOfReservation < 2) result=true;
		result = false;
		return result;
	}
	
}
