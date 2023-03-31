package HotelReservation.Service;

import java.util.ArrayList;
import java.util.List;

import HotelReservation.Dto.CustomerDto;
import HotelReservation.Dto.ReservationDto;
import HotelReservation.Dto.RoomDto;
import HotelReservation.RoomInfo.RoomInfo;

public class ReservationService {

	RoomDto roomDto = new RoomDto();
	CustomerDto customerDto = new CustomerDto();
	List<ReservationDto> roomList = new ArrayList<>();
	ReservationDto reservationDto = new ReservationDto();
	
	public void reservation() {
	while(true) {
		customerDto.reservationInfo();
		roomDto.selectRoom();
		boolean result = roomDto.isEmptyRoom()||customerDto.isEmpty();
		if(result){
			System.out.println("모두 입력하세요");
			continue;
		}
		roomDto.addRoomList();
		if(roomDto.checkRoom()) {
			System.out.println("객실을 잘못 입력 하셨습니다.");
			continue;
		}
		if(roomDto.checkReservation()) {
			System.out.println("숙박형태를 잘못 입력 하셨습니다.");
			continue;
		}
		roomList = reservationDto.reservationList();
		System.out.println("예약완료");
		System.out.println(roomList);
		break;
		
		
	}
}
	public void makeList() {
		reservationDto.setCustomer(customerDto);
		reservationDto.setRoom(roomDto);
//		setTelNumber(customerDto.getTelNumber());
//		reservationDto.getCustomer().setCountOfReservation(customerDto.getCountOfReservation());
//		reservationDto.getRoom().setKindOfRooms(roomDto.getKindOfRooms());
//		reservationDto.getRoom().setKindOfreservation(roomDto.getKindOfreservation());
//		reservationDto.getRoom().setRoomList(roomDto.getRoomList());
		roomList.add(reservationDto);
	}
}