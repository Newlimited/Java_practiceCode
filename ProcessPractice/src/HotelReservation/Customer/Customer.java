package HotelReservation.Customer;

import java.util.Scanner;

public class Customer {
	private  String name;
	private  String kindOfReservation;
	private  int people;
	private String kindsOfRoom;
	
	public Customer() {
	}

	public Customer(String name, String kindOfReservation, int people, String kindsOfRoom) {
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

	public String getKindOfReservation() {
		return kindOfReservation;
	}

	public void setKindOfReservation(String kindOfReservation) {
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
		int addCost = 0;
		if(people > 2) {
			addCost = 10_000*(people - 2);
		}
		
		return "[예약자 이름=" + name + ", 예약종류 =" + kindOfReservation  + ", 인원수 =" + people
				+ ", 객실 형태 =" + kindsOfRoom.toUpperCase() + "] " + "추가요금 : " + addCost + "원 입니다";
	}

	
		
}