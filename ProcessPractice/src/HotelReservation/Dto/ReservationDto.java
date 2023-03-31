package HotelReservation.Dto;

import java.util.ArrayList;
import java.util.List;

public class ReservationDto {
	RoomDto room;
	CustomerDto customer;
	private String name;
	private String telNumber;
	private int countOfReservation;
	private String kindOfreservation;
	private String kindOfRooms;
	private int costOfRoom;
	List<ReservationDto> reservationList = new ArrayList<>();
	
	public ReservationDto() {
		
	}
	public List<ReservationDto> reservationList() {
	ReservationDto reservationDto = new ReservationDto();
	reservationDto.name = customer.getName();
	reservationDto.telNumber = customer.getTelNumber();
	reservationDto.countOfReservation = customer.getCountOfReservation();
	reservationDto.kindOfreservation = room.getKindOfreservation();
	reservationDto.kindOfRooms = room.getKindOfRooms();
	reservationDto.costOfRoom = room.getCostOfRoom();
	reservationList.add(reservationDto);
	return reservationList;
	}
	public RoomDto getRoom() {
		return room;
	}
	public void setRoom(RoomDto room) {
		this.room = room;
	}
	public CustomerDto getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		costOfRoom = room.getCostOfRoom() + 
				(10000 * (customer.getCountOfReservation() - 2 ));
		return "ReservationDto [예약이름 =" + name + ", 예약자 번호 =" + telNumber + ", 예약인원 수 ="
				+ countOfReservation + ", 숙박 형태 =" + kindOfreservation + ", 객실 =" + kindOfRooms
				+ ", 가격 =" + costOfRoom + "]";
	}
	public ReservationDto(String name, String telNumber, int countOfReservation, String kindOfreservation,
			String kindOfRooms, int costOfRoom) {
	
	}
}
