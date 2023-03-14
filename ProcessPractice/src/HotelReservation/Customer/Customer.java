package HotelReservation.Customer;

import java.util.Scanner;

public class Customer {
	private  String name;
	private  int kindOfReservation;
	private  int people;
	private String kindsOfRoom;
	
	public Customer() {
	}

	public Customer(String name, int kindOfReservation, int people, String kindsOfRoom) {
		this.name = name;
		this.kindOfReservation = kindOfReservation;
		this.people = people;
		this.kindsOfRoom = kindsOfRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKindOfReservation() {
		return kindOfReservation;
	}

	public void setKindOfReservation(int kindOfReservation) {
		this.kindOfReservation = kindOfReservation;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public String getKindsOfRoom() {
		return kindsOfRoom;
	}

	public void setKindsOfRoom(String kindsOfRoom) {
		this.kindsOfRoom = kindsOfRoom;
	}

	@Override
	public String toString() {
		String result = null;
		int addCost = 0;
		if(kindOfReservation == 1)  result = "대실";
		if(kindOfReservation == 2)  result = "숙박";
		if(people > 2) {
			addCost = 10_000*(people - 2);
		}
		
		return "[예약자 이름=" + name + ", 예약종류 =" + result + ", 인원수 =" + people
				+ ", 객실 형태 =" + kindsOfRoom.toUpperCase() + "] " + "추가요금 : " + addCost + "원 입니다";
	}

		
}